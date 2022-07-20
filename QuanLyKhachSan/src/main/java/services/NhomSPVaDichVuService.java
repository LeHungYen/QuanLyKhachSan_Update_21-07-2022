package services;

import java.util.ArrayList;
import java.util.List;

import dao.NhomSPVaDichVuDao;
import entities.NhomSPVaDichVu;
import models.NhomSPVaDichVuModel;
import utils.IoCContainer;

public class NhomSPVaDichVuService implements INhomSPvaDichVuService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<NhomSPVaDichVuModel> _listNhomSPVaDichVuModels = new ArrayList<NhomSPVaDichVuModel>();
	private List<NhomSPVaDichVuModel> _listNhomSPVaDichVuModelsInactive = new ArrayList<NhomSPVaDichVuModel>();
	private List<NhomSPVaDichVuModel> _listNhomSPVaDichVuModelsActive = new ArrayList<NhomSPVaDichVuModel>();
	private NhomSPVaDichVuDao _NhomSPVaDichVuDao = (NhomSPVaDichVuDao) ioCContainer.getBean(NhomSPVaDichVuDao.class.toString());
	private NhomSPVaDichVu _NhomSPVaDichVu;

	public static NhomSPVaDichVu updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		NhomSPVaDichVu NhomSPVaDichVu = new NhomSPVaDichVu();
		NhomSPVaDichVu.setMaNhomSP(NhomSPVaDichVuModel.getMaNhomSP());
		NhomSPVaDichVu.setTenNhomSP(NhomSPVaDichVuModel.getTenNhomSP());
		NhomSPVaDichVu.setNhomHangHoa(NhomSPVaDichVuModel.getNhomHangHoa());
		NhomSPVaDichVu.setGhiChu(NhomSPVaDichVuModel.getGhiChu());
		NhomSPVaDichVu.setTrangThai(NhomSPVaDichVuModel.getTrangThai());
		NhomSPVaDichVu.setListSanPhamVaDichVu(SanPhamVaDichVuService.updateListSanPhamVaDichVuDependOnListSanPhamVaDichVuModel(NhomSPVaDichVuModel.getListSanPhamVaDichVuModel()));
		return NhomSPVaDichVu;
	}
	public static NhomSPVaDichVuModel updateDataNhomSPVaDichVuModelDependOnNhomSPVaDichVu(NhomSPVaDichVu NhomSPVaDichVu) {
		NhomSPVaDichVuModel nhomSPVaDichVuModel = new NhomSPVaDichVuModel();
		nhomSPVaDichVuModel.setMaNhomSP(NhomSPVaDichVu.getMaNhomSP());
		nhomSPVaDichVuModel.setTenNhomSP(NhomSPVaDichVu.getTenNhomSP());
		nhomSPVaDichVuModel.setNhomHangHoa(NhomSPVaDichVu.getNhomHangHoa());
		nhomSPVaDichVuModel.setGhiChu(NhomSPVaDichVu.getGhiChu());
		nhomSPVaDichVuModel.setTrangThai(NhomSPVaDichVu.getTrangThai());
		nhomSPVaDichVuModel.setListSanPhamVaDichVuModel(SanPhamVaDichVuService.updateListSanPhamVaDichVuModelDependOnListSanPhamVaDichVu(NhomSPVaDichVu.getListSanPhamVaDichVu()));
		return nhomSPVaDichVuModel;
	}
	
	public static List<NhomSPVaDichVuModel> updateListNhomSPVaDichVuModelDependOnListNhomSPVaDichVu (List<NhomSPVaDichVu> listNhomSPVaDichVu){
		List<NhomSPVaDichVuModel> listNhomSPVaDichVuModel = new ArrayList<NhomSPVaDichVuModel>();
		for (NhomSPVaDichVu nhomSPVaDichVu : listNhomSPVaDichVu) {
			NhomSPVaDichVuModel nhomSPVaDichVuModel = updateDataNhomSPVaDichVuModelDependOnNhomSPVaDichVu(nhomSPVaDichVu);
			listNhomSPVaDichVuModel.add(nhomSPVaDichVuModel);
		}
		return listNhomSPVaDichVuModel;
	}
	
	public static List<NhomSPVaDichVu> updateListNhomSPVaDichVuDependOnListNhomSPVaDichVuModel (List<NhomSPVaDichVuModel> listNhomSPVaDichVuModel){
		List<NhomSPVaDichVu> listNhomSPVaDichVu = new ArrayList<NhomSPVaDichVu>();
		for (NhomSPVaDichVuModel nhomSPVaDichVuModel : listNhomSPVaDichVuModel) {
			NhomSPVaDichVu nhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(nhomSPVaDichVuModel);
			listNhomSPVaDichVu.add(nhomSPVaDichVu);
		}
		return listNhomSPVaDichVu;
	}

	public void them_sua(NhomSPVaDichVuModel NhomSPVaDichVuModel) {
		boolean checkExisted = false;
		for(int i = 0 ; i< _listNhomSPVaDichVuModels.size() ; i++) {
			if(_listNhomSPVaDichVuModels.get(i).getMaNhomSP() == NhomSPVaDichVuModel.getMaNhomSP()) {
				_listNhomSPVaDichVuModels.get(i).setTenNhomSP(NhomSPVaDichVuModel.getTenNhomSP());
				_listNhomSPVaDichVuModels.get(i).setNhomHangHoa(NhomSPVaDichVuModel.getNhomHangHoa());
				_listNhomSPVaDichVuModels.get(i).setGhiChu(NhomSPVaDichVuModel.getGhiChu());
				_listNhomSPVaDichVuModels.get(i).setTrangThai(NhomSPVaDichVuModel.getTrangThai());
				
				_NhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(_listNhomSPVaDichVuModels.get(i));
				_NhomSPVaDichVuDao.them_sua(_NhomSPVaDichVu);
				checkExisted = true;
				break;
			}
		}
		if(!checkExisted) {
			_NhomSPVaDichVu = updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(NhomSPVaDichVuModel);
			_NhomSPVaDichVuDao.them_sua(_NhomSPVaDichVu);
			_listNhomSPVaDichVuModels.add(NhomSPVaDichVuModel);
		}
	}

	public void updateListNhomSPVaDichVuModel() {
		_NhomSPVaDichVuDao.updateListNhomSPVaDichVu();
		List<NhomSPVaDichVu> listNhomSPVaDichVu = _NhomSPVaDichVuDao.getListNhomSPVaDichVu();
		_listNhomSPVaDichVuModels = updateListNhomSPVaDichVuModelDependOnListNhomSPVaDichVu(listNhomSPVaDichVu);
		filterList();
	}
	
	public void filterList() {
		for (NhomSPVaDichVuModel nhomSPVaDichVuModel : _listNhomSPVaDichVuModels) {
			if(nhomSPVaDichVuModel.getTrangThai().equals("Ho?t Ð?ng")) {
				_listNhomSPVaDichVuModelsActive.add(nhomSPVaDichVuModel);
			}else {
				_listNhomSPVaDichVuModelsInactive.add(nhomSPVaDichVuModel);
			}
		}
	}

	public List<NhomSPVaDichVuModel> getListNhomSPVaDichVuModel() {
		return _listNhomSPVaDichVuModels;
	}
	public List<NhomSPVaDichVuModel> getListNhomSPVaDichVuModelActive() {
		return _listNhomSPVaDichVuModelsActive;
	}
	public List<NhomSPVaDichVuModel> getListNhomSPVaDichVuModelInactive() {
		return _listNhomSPVaDichVuModelsInactive;
	}
	

}
