package services;

import java.util.ArrayList;
import java.util.List;

import dao.KhoDao;
import entities.Kho;
import models.KhoModel;
import models.SanPhamVaDichVuModel;
import utils.IoCContainer;

public class KhoService implements IKhoService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<KhoModel> _listKhoModels = new ArrayList<KhoModel>();
	private KhoDao _KhoDao = (KhoDao) ioCContainer.getBean(KhoDao.class.toString());
	private Kho _Kho;

	public static Kho updateDataKhoDependOnKhoModel(KhoModel KhoModel) {
		Kho Kho = new Kho();
		Kho.setMaKho(KhoModel.getMaKho());
		Kho.setTenKho(KhoModel.getTenKho());
		Kho.setTrangThai(KhoModel.getTrangThai());
		Kho.setListPhieuKiemKho(PhieuKiemKhoService.updateListPhieuKiemKhoDependOnListPhieuKiemKhoModel(KhoModel.getListPhieuKiemKhoModel()));
		Kho.setListSanPhamVaDichVu(SanPhamVaDichVuService.updateListSanPhamVaDichVuDependOnListSanPhamVaDichVuModel(KhoModel.getListSanPhamVaDichVuModel()));
		return Kho;
	}
	
	public static KhoModel updateDataKhoModelDependOnKho(Kho kho) {
		KhoModel khoModel = new KhoModel();
		khoModel.setMaKho(kho.getMaKho());
		khoModel.setTenKho(kho.getTenKho());
		khoModel.setTrangThai(kho.getTrangThai());
		khoModel.setListPhieuKiemKhoModel(PhieuKiemKhoService.updateListPhieuKiemKhoModelDependOnListPhieuKiemKho(kho.getListPhieuKiemKho()));
		khoModel.setListSanPhamVaDichVuModel(SanPhamVaDichVuService.updateListSanPhamVaDichVuModelDependOnListSanPhamVaDichVu(kho.getListSanPhamVaDichVu()));
		return khoModel;
	}
	
	public static List<Kho> updateListKhoDependOnListKhoModel(List<KhoModel> listKhoModel) {
		List<Kho> listKho = new ArrayList<Kho>();
		for (KhoModel khoModel2 : listKhoModel) {
			Kho kho = updateDataKhoDependOnKhoModel(khoModel2);
			listKho.add(kho);
		}
		return listKho;
	}
	
	public static List<KhoModel> updateListKhoModelDependOnListKho(List<Kho> listKho) {
		List<KhoModel> listKhoModel = new ArrayList<KhoModel>();
		for (Kho kho : listKho) {
			KhoModel khoModel = updateDataKhoModelDependOnKho(kho);
			listKhoModel.add(khoModel);
		}
		return listKhoModel;
	}

	public void them_sua(KhoModel khoModel) {
		boolean checkExisted = false;
		for(int i = 0 ; i< _listKhoModels.size() ; i++) {
			if(_listKhoModels.get(i).getMaKho() == khoModel.getMaKho()) {
				_listKhoModels.get(i).setTenKho(khoModel.getTenKho());
				_listKhoModels.get(i).setTrangThai(khoModel.getTrangThai());
				_Kho = updateDataKhoDependOnKhoModel(_listKhoModels.get(i));
				_KhoDao.them_sua(_Kho);
				checkExisted = true;
				break;
			}
		}
		if(!checkExisted) {
			_Kho = updateDataKhoDependOnKhoModel(khoModel);
			_KhoDao.them_sua(_Kho);
			_listKhoModels.add(khoModel);
		}
	}

	
	public void updateListKhoModel() {
		_KhoDao.updateListKho();
		List<Kho> listKho = _KhoDao.getListKho();
		_listKhoModels = updateListKhoModelDependOnListKho(listKho);

	}

	public List<KhoModel> getListKhoModel() {
		return _listKhoModels;
	}

}
