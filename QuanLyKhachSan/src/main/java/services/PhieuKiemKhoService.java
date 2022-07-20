package services;

import java.util.ArrayList;
import java.util.List;

import dao.PhieuKiemKhoDao;
import entities.PhieuKiemKho;
import models.PhieuKiemKhoModel;
import utils.IoCContainer;

public class PhieuKiemKhoService implements IPhieuKiemKhoService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<PhieuKiemKhoModel> _listPhieuKiemKhoModels = new ArrayList<PhieuKiemKhoModel>();
	private PhieuKiemKhoDao _PhieuKiemKhoDao = (PhieuKiemKhoDao) ioCContainer.getBean(PhieuKiemKhoDao.class.toString());
	private PhieuKiemKho _PhieuKiemKho;

	public static PhieuKiemKho updateDataPhieuKiemKhoDependOnPhieuKiemKhoModel(PhieuKiemKhoModel PhieuKiemKhoModel) {
		PhieuKiemKho PhieuKiemKho = new PhieuKiemKho();
		PhieuKiemKho.setMaKiemKho(PhieuKiemKhoModel.getMaKiemKho());
		PhieuKiemKho.setNgayKiemKho(PhieuKiemKhoModel.getNgayKiemKho());
		PhieuKiemKho.setNhanVien(NhanVienService.updateDataNhanVienDependOnNhanVienModel(PhieuKiemKhoModel.getNhanVienModel()));
		PhieuKiemKho.setKho(KhoService.updateDataKhoDependOnKhoModel(PhieuKiemKhoModel.getKhoModel()));
		PhieuKiemKho.setListPhieuKiemKhoChiTiet(PhieuKiemKhoChiTietService.updateListPhieuKiemKhoChiTietDependOnListPhieuKiemKhoChiTietModel(PhieuKiemKhoModel.getListPhieuKiemKhoChiTietModel()));
		return PhieuKiemKho;
	}
	public static PhieuKiemKhoModel updateDataPhieuKiemKhoModelDependOnPhieuKiemKho(PhieuKiemKho PhieuKiemKho) {
		PhieuKiemKhoModel PhieuKiemKhoModel = new PhieuKiemKhoModel();
		PhieuKiemKhoModel.setMaKiemKho(PhieuKiemKho.getMaKiemKho());
		PhieuKiemKhoModel.setNgayKiemKho(PhieuKiemKho.getNgayKiemKho());
		PhieuKiemKhoModel.setNhanVienModel(NhanVienService.updateDataNhanVienModelDependOnNhanVien(PhieuKiemKho.getNhanVien()));
		PhieuKiemKhoModel.setKhoModel(KhoService.updateDataKhoModelDependOnKho(PhieuKiemKho.getKho()));
		PhieuKiemKhoModel.setListPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietService.updateListPhieuKiemKhoChiTietModelDependOnListPhieuKiemKhoChiTiet(PhieuKiemKho.getListPhieuKiemKhoChiTiet()));
		return PhieuKiemKhoModel;
	}
	
	public static List<PhieuKiemKhoModel> updateListPhieuKiemKhoModelDependOnListPhieuKiemKho (List<PhieuKiemKho> listPhieuKiemKho){
		List<PhieuKiemKhoModel> listPhieuKiemKhoModel = new ArrayList<PhieuKiemKhoModel>();
		for (PhieuKiemKho phieuKiemKho : listPhieuKiemKho) {
			PhieuKiemKhoModel phieuKiemKhoModel = updateDataPhieuKiemKhoModelDependOnPhieuKiemKho(phieuKiemKho);
			listPhieuKiemKhoModel.add(phieuKiemKhoModel);
		}
		return listPhieuKiemKhoModel;
	}
	public static List<PhieuKiemKho> updateListPhieuKiemKhoDependOnListPhieuKiemKhoModel (List<PhieuKiemKhoModel> listPhieuKiemKhoModel){
		List<PhieuKiemKho> listPhieuKiemKho = new ArrayList<PhieuKiemKho>();
		for (PhieuKiemKhoModel phieuKiemKhoModel : listPhieuKiemKhoModel) {
			PhieuKiemKho phieuKiemKho = updateDataPhieuKiemKhoDependOnPhieuKiemKhoModel(phieuKiemKhoModel);
			listPhieuKiemKho.add(phieuKiemKho);
		}
		return listPhieuKiemKho;
	}

	public void them_sua(PhieuKiemKhoModel PhieuKiemKhoModel) {
		_PhieuKiemKho = updateDataPhieuKiemKhoDependOnPhieuKiemKhoModel(PhieuKiemKhoModel);
		_PhieuKiemKhoDao.them_sua(_PhieuKiemKho);
		_listPhieuKiemKhoModels.add( PhieuKiemKhoModel);
	}
	
	public void updateListPhieuKiemKhoModel() {
		_PhieuKiemKhoDao.updateListPhieuKiemKho();
		List<PhieuKiemKho> listPhieuKiemKho = _PhieuKiemKhoDao.getListPhieuKiemKho();
		_listPhieuKiemKhoModels = updateListPhieuKiemKhoModelDependOnListPhieuKiemKho(listPhieuKiemKho);
	}

	public List<PhieuKiemKhoModel> getListPhieuKiemKhoModel() {
		return _listPhieuKiemKhoModels;
	}

}
