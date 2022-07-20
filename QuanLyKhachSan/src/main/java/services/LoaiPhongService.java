package services;

import java.util.ArrayList;
import java.util.List;

import dao.LoaiPhongDao;
import entities.LoaiPhong;
import models.LoaiPhongModel;
import utils.IoCContainer;

public class LoaiPhongService implements ILoaiPhongService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<LoaiPhongModel> _listLoaiPhongModels = new ArrayList<LoaiPhongModel>();
	private LoaiPhongDao _LoaiPhongDao = (LoaiPhongDao) ioCContainer.getBean(LoaiPhongDao.class.toString());
	private LoaiPhong _LoaiPhong;

	public static LoaiPhong updateDataLoaiPhongDependOnLoaiPhongModel(LoaiPhongModel LoaiPhongModel) {
		LoaiPhong LoaiPhong = new LoaiPhong();
		LoaiPhong.setMaLoaiPhong(LoaiPhongModel.getMaLoaiPhong());
		LoaiPhong.setTenLoai(LoaiPhongModel.getTenLoai());
		LoaiPhong.setSoNguoiToiDa(LoaiPhongModel.getSoNguoiToiDa());
		LoaiPhong.setGiaQuaDem(LoaiPhongModel.getGiaQuaDem());
		LoaiPhong.setGiaTheoGio(LoaiPhongModel.getGiaTheoGio());
		LoaiPhong.setGia(GiaService.updateDataGiaDependOnGiaModel(LoaiPhongModel.getGiaModel()));
		LoaiPhong.setListPhong(PhongService.updateListPhongDependOnListPhongModel(LoaiPhongModel.getListPhongModel()));
		return LoaiPhong;
	}
	
	public static LoaiPhongModel updateDataLoaiPhongModelDependOnLoaiPhong(LoaiPhong LoaiPhong) {
		LoaiPhongModel LoaiPhongModel = new LoaiPhongModel();
		LoaiPhongModel.setMaLoaiPhong(LoaiPhong.getMaLoaiPhong());
		LoaiPhongModel.setTenLoai(LoaiPhong.getTenLoai());
		LoaiPhongModel.setSoNguoiToiDa(LoaiPhong.getSoNguoiToiDa());
		LoaiPhongModel.setGiaQuaDem(LoaiPhong.getGiaQuaDem());
		LoaiPhongModel.setGiaTheoGio(LoaiPhong.getGiaTheoGio());
		LoaiPhongModel.setGiaModel(GiaService.updateDataGiaModelDependOnGia(LoaiPhong.getGia()));
		LoaiPhongModel.setListPhongModel(PhongService.updateListPhongModelDependOnListPhong(LoaiPhong.getListPhong()));
		return LoaiPhongModel;
	}
	
	public static List<LoaiPhong> updateListLoaiPhongDependOnListLoaiPhongModel(List<LoaiPhongModel> listLoaiPhongModel) {
		List<LoaiPhong> listLoaiPhong = new ArrayList<LoaiPhong>();
		for (LoaiPhongModel LoaiPhongModel2 : listLoaiPhongModel) {
			LoaiPhong LoaiPhong = updateDataLoaiPhongDependOnLoaiPhongModel(LoaiPhongModel2);
			listLoaiPhong.add(LoaiPhong);
		}
		return listLoaiPhong;
	}
	
	public static List<LoaiPhongModel> updateListLoaiPhongModelDependOnListLoaiPhong(List<LoaiPhong> listLoaiPhong) {
		List<LoaiPhongModel> listLoaiPhongModel = new ArrayList<LoaiPhongModel>();
		for (LoaiPhong LoaiPhong : listLoaiPhong) {
			LoaiPhongModel LoaiPhongModel = updateDataLoaiPhongModelDependOnLoaiPhong(LoaiPhong);
			listLoaiPhongModel.add(LoaiPhongModel);
		}
		return listLoaiPhongModel;
	}

	public void them_sua(LoaiPhongModel LoaiPhongModel) {
		_LoaiPhong = updateDataLoaiPhongDependOnLoaiPhongModel(LoaiPhongModel);
		_LoaiPhongDao.them_sua(_LoaiPhong);
		_listLoaiPhongModels.add(LoaiPhongModel);// check lại
	}

	public void updateListLoaiPhongModel() {
		_LoaiPhongDao.updateListLoaiPhong();
		List<LoaiPhong> listLoaiPhong = _LoaiPhongDao.getListLoaiPhong();
		_listLoaiPhongModels = updateListLoaiPhongModelDependOnListLoaiPhong(listLoaiPhong);

	}

	public List<LoaiPhongModel> getListLoaiPhongModel() {
		return _listLoaiPhongModels;
	}
}
