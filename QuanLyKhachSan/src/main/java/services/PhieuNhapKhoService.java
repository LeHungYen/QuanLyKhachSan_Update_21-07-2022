package services;

import java.util.ArrayList;
import java.util.List;

import dao.PhieuNhapKhoDao;
import entities.PhieuNhapKho;
import models.PhieuNhapKhoModel;
import utils.IoCContainer;

public class PhieuNhapKhoService implements IPhieuNhapKhoService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<PhieuNhapKhoModel> _listPhieuNhapKhoModels = new ArrayList<PhieuNhapKhoModel>();
	private PhieuNhapKhoDao _PhieuNhapKhoDao = (PhieuNhapKhoDao) ioCContainer.getBean(PhieuNhapKhoDao.class.toString());
	private PhieuNhapKho _PhieuNhapKho;

	public static PhieuNhapKho updateDataPhieuNhapKhoDependOnPhieuNhapKhoModel(PhieuNhapKhoModel PhieuNhapKhoModel) {
		PhieuNhapKho PhieuNhapKho = new PhieuNhapKho();
		PhieuNhapKho.setMaNhap(PhieuNhapKhoModel.getMaNhap());
		PhieuNhapKho.setGhiChu(PhieuNhapKhoModel.getGhiChu());
		PhieuNhapKho.setNgayNhap(PhieuNhapKhoModel.getNgayNhap());
		PhieuNhapKho.setTinhTrang(PhieuNhapKhoModel.getTinhTrang());
		PhieuNhapKho.setNhanVien(NhanVienService.updateDataNhanVienDependOnNhanVienModel(PhieuNhapKhoModel.getNhanVienModel()));
		PhieuNhapKho.setGiamGia(PhieuNhapKhoModel.getGiamGia());
		PhieuNhapKho.setVat(PhieuNhapKhoModel.getVat());
		PhieuNhapKho.setPhiShip(PhieuNhapKhoModel.getPhiShip());
		PhieuNhapKho.setListPhieuNhapKhoChiTiet(PhieuNhapKhoChiTietService.updateListPhieuNhapKhoChiTietDependOnListPhieuNhapKhoChiTietModel(PhieuNhapKhoModel.getListPhieuNhapKhoChiTietModel()));
		return PhieuNhapKho;
	}
	public static PhieuNhapKhoModel updateDataPhieuNhapKhoModelDependOnPhieuNhapKho(PhieuNhapKho PhieuNhapKho) {
		PhieuNhapKhoModel PhieuNhapKhoModel = new PhieuNhapKhoModel();
		PhieuNhapKhoModel.setMaNhap(PhieuNhapKho.getMaNhap());
		PhieuNhapKhoModel.setGhiChu(PhieuNhapKho.getGhiChu());
		PhieuNhapKhoModel.setNgayNhap(PhieuNhapKho.getNgayNhap());
		PhieuNhapKhoModel.setTinhTrang(PhieuNhapKho.getTinhTrang());
		PhieuNhapKhoModel.setNhanVienModel(NhanVienService.updateDataNhanVienModelDependOnNhanVien(PhieuNhapKho.getNhanVien()));
		PhieuNhapKhoModel.setGiamGia(PhieuNhapKho.getGiamGia());
		PhieuNhapKhoModel.setVat(PhieuNhapKho.getVat());
		PhieuNhapKhoModel.setPhiShip(PhieuNhapKho.getPhiShip());
		PhieuNhapKhoModel.setListPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietService.updateListPhieuNhapKhoChiTietModelDependOnListPhieuNhapKhoChiTiet(PhieuNhapKho.getListPhieuNhapKhoChiTiet()));
		return PhieuNhapKhoModel;
	}

	public static List<PhieuNhapKhoModel> updateListPhieuNhapKhoModelDependOnListPhieuNhapKho (List<PhieuNhapKho> listPhieuNhapKho){
		List<PhieuNhapKhoModel> listPhieuNhapKhoModel = new ArrayList<PhieuNhapKhoModel>();
		for (PhieuNhapKho phieuNhapKho : listPhieuNhapKho) {
			PhieuNhapKhoModel phieuNhapKhoModel = updateDataPhieuNhapKhoModelDependOnPhieuNhapKho(phieuNhapKho);
			listPhieuNhapKhoModel.add(phieuNhapKhoModel);
		}
		return listPhieuNhapKhoModel;
	}
	
	public static List<PhieuNhapKho> updateListPhieuNhapKhoDependOnListPhieuNhapKhoModel (List<PhieuNhapKhoModel> listPhieuNhapKhoModel){
		List<PhieuNhapKho> listPhieuNhapKho = new ArrayList<PhieuNhapKho>();
		for (PhieuNhapKhoModel phieuNhapKhoModel : listPhieuNhapKhoModel) {
			PhieuNhapKho phieuNhapKho = updateDataPhieuNhapKhoDependOnPhieuNhapKhoModel(phieuNhapKhoModel);
			listPhieuNhapKho.add(phieuNhapKho);
		}
		return listPhieuNhapKho;
	}
	
	public void them_sua(PhieuNhapKhoModel PhieuNhapKhoModel) {
		_PhieuNhapKho = updateDataPhieuNhapKhoDependOnPhieuNhapKhoModel(PhieuNhapKhoModel);
		_PhieuNhapKhoDao.them_sua(_PhieuNhapKho);
		_listPhieuNhapKhoModels.add(PhieuNhapKhoModel);
	}

	public void updateListPhieuNhapKhoModel() {
		_PhieuNhapKhoDao.updateListPhieuNhapKho();
		List<PhieuNhapKho> listPhieuNhapKho = _PhieuNhapKhoDao.getListPhieuNhapKho();
		_listPhieuNhapKhoModels = updateListPhieuNhapKhoModelDependOnListPhieuNhapKho(listPhieuNhapKho);

	}

	public List<PhieuNhapKhoModel> getListPhieuNhapKhoModel() {
		return _listPhieuNhapKhoModels;
	}

}
