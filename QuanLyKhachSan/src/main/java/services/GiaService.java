package services;

import java.util.ArrayList;
import java.util.List;

import dao.GiaDao;
import entities.Gia;
import models.GiaModel;
import utils.IoCContainer;

public class GiaService implements IGiaService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<GiaModel> _listGiaModels = new ArrayList<GiaModel>();
	private GiaDao _GiaDao = (GiaDao) ioCContainer.getBean(GiaDao.class.toString());
	private Gia _Gia;

	public static Gia updateDataGiaDependOnGiaModel(GiaModel GiaModel) {
		Gia Gia = new Gia();
		Gia.setMaGia(GiaModel.getMaGia());
		Gia.setGioCheckIn(GiaModel.getGioCheckIn());
		Gia.setGioCheckOut(GiaModel.getGioCheckOut());
		Gia.setPhatCheckInSom(GiaModel.getPhatCheckInSom());
		Gia.setPhatCheckOutMuon(GiaModel.getPhatCheckOutMuon());
		Gia.setListLoaiPhong(LoaiPhongService.updateListLoaiPhongDependOnListLoaiPhongModel(GiaModel.getListLoaiPhongModel()));
		return Gia;
	}
	
	public static GiaModel updateDataGiaModelDependOnGia(Gia Gia) {
		GiaModel GiaModel = new GiaModel();
		GiaModel.setMaGia(Gia.getMaGia());
		GiaModel.setGioCheckIn(Gia.getGioCheckIn());
		GiaModel.setGioCheckOut(Gia.getGioCheckOut());
		GiaModel.setPhatCheckInSom(Gia.getPhatCheckInSom());
		GiaModel.setPhatCheckOutMuon(Gia.getPhatCheckOutMuon());
		GiaModel.setListLoaiPhongModel(LoaiPhongService.updateListLoaiPhongModelDependOnListLoaiPhong(Gia.getListLoaiPhong()));
		return GiaModel;
	}
	
	public static List<Gia> updateListGiaDependOnListGiaModel(List<GiaModel> listGiaModel) {
		List<Gia> listGia = new ArrayList<Gia>();
		for (GiaModel GiaModel2 : listGiaModel) {
			Gia Gia = updateDataGiaDependOnGiaModel(GiaModel2);
			listGia.add(Gia);
		}
		return listGia;
	}
	
	public static List<GiaModel> updateListGiaModelDependOnListGia(List<Gia> listGia) {
		List<GiaModel> listGiaModel = new ArrayList<GiaModel>();
		for (Gia Gia : listGia) {
			GiaModel GiaModel = updateDataGiaModelDependOnGia(Gia);
			listGiaModel.add(GiaModel);
		}
		return listGiaModel;
	}

	public void them_sua(GiaModel GiaModel) {
		_Gia = updateDataGiaDependOnGiaModel(GiaModel);
		_GiaDao.them_sua(_Gia);
		_listGiaModels.add(GiaModel);// check lại
	}

	public void updateListGiaModel() {
		_GiaDao.updateListGia();
		List<Gia> listGia = _GiaDao.getListGia();
		_listGiaModels = updateListGiaModelDependOnListGia(listGia);

	}

	public List<GiaModel> getListGiaModel() {
		return _listGiaModels;
	}
}
