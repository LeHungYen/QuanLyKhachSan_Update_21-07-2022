package services;

import java.util.ArrayList;
import java.util.List;

import dao.PhieuNhapKhoChiTietDao;
import entities.PhieuNhapKhoChiTiet;
import models.PhieuNhapKhoChiTietModel;
import utils.IoCContainer;

public class PhieuNhapKhoChiTietService implements IPhieuNhapKhoChiTietService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<PhieuNhapKhoChiTietModel> _listPhieuNhapKhoChiTietModels = new ArrayList<PhieuNhapKhoChiTietModel>();
	private PhieuNhapKhoChiTietDao _PhieuNhapKhoChiTietDao = (PhieuNhapKhoChiTietDao) ioCContainer.getBean(PhieuNhapKhoChiTietDao.class.toString());
	private PhieuNhapKhoChiTiet _PhieuNhapKhoChiTiet;

	public static PhieuNhapKhoChiTiet updateDataPhieuNhapKhoChiTietDependOnPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietModel PhieuNhapKhoChiTietModel) {
		PhieuNhapKhoChiTiet PhieuNhapKhoChiTiet = new PhieuNhapKhoChiTiet();
		PhieuNhapKhoChiTiet.setPhieuNhapKho(PhieuNhapKhoService.updateDataPhieuNhapKhoDependOnPhieuNhapKhoModel(PhieuNhapKhoChiTietModel.getPhieuNhapKhoModel()));
		PhieuNhapKhoChiTiet.setSanPhamVaDichVu(SanPhamVaDichVuService.updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(PhieuNhapKhoChiTietModel.getSanPhamVaDichVuModel()));
		PhieuNhapKhoChiTiet.setSoLuong(PhieuNhapKhoChiTietModel.getSoLuong());
		PhieuNhapKhoChiTiet.setGiaNhap(PhieuNhapKhoChiTietModel.getGiaNhap());
		PhieuNhapKhoChiTiet.setGhiChu(PhieuNhapKhoChiTietModel.getGhiChu());
		return PhieuNhapKhoChiTiet;
	}
	public static PhieuNhapKhoChiTietModel updateDataPhieuNhapKhoChiTietModelDependOnPhieuNhapKhoChiTiet(PhieuNhapKhoChiTiet phieuNhapKhoChiTiet) {
		PhieuNhapKhoChiTietModel PhieuNhapKhoChiTietModel = new PhieuNhapKhoChiTietModel();
		PhieuNhapKhoChiTietModel.setPhieuNhapKhoModel(PhieuNhapKhoService.updateDataPhieuNhapKhoModelDependOnPhieuNhapKho(phieuNhapKhoChiTiet.getPhieuNhapKho()));
		PhieuNhapKhoChiTietModel.setSanPhamVaDichVuModel(SanPhamVaDichVuService.updateDataSanPhamVaDichVuModelDependOnSanPhamVaDichVu(phieuNhapKhoChiTiet.getSanPhamVaDichVu()));
		PhieuNhapKhoChiTietModel.setSoLuong(phieuNhapKhoChiTiet.getSoLuong());
		PhieuNhapKhoChiTietModel.setGiaNhap(phieuNhapKhoChiTiet.getGiaNhap());
		PhieuNhapKhoChiTietModel.setGhiChu(phieuNhapKhoChiTiet.getGhiChu());
		return PhieuNhapKhoChiTietModel;
	}

	public static List<PhieuNhapKhoChiTietModel> updateListPhieuNhapKhoChiTietModelDependOnListPhieuNhapKhoChiTiet (List<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet){
		List<PhieuNhapKhoChiTietModel> listPhieuNhapKhoChiTietModel = new ArrayList<PhieuNhapKhoChiTietModel>();
		for (PhieuNhapKhoChiTiet phieuNhapKhoChiTiet : listPhieuNhapKhoChiTiet) {
			PhieuNhapKhoChiTietModel phieuNhapKhoChiTietModel = updateDataPhieuNhapKhoChiTietModelDependOnPhieuNhapKhoChiTiet(phieuNhapKhoChiTiet);
			listPhieuNhapKhoChiTietModel.add(phieuNhapKhoChiTietModel);
		}
		return listPhieuNhapKhoChiTietModel;
	}
	public static List<PhieuNhapKhoChiTiet> updateListPhieuNhapKhoChiTietDependOnListPhieuNhapKhoChiTietModel (List<PhieuNhapKhoChiTietModel> listPhieuNhapKhoChiTietModel){
		List<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet = new ArrayList<PhieuNhapKhoChiTiet>();
		for (PhieuNhapKhoChiTietModel phieuNhapKhoChiTietModel : listPhieuNhapKhoChiTietModel) {
			PhieuNhapKhoChiTiet phieuNhapKhoChiTiet = updateDataPhieuNhapKhoChiTietDependOnPhieuNhapKhoChiTietModel(phieuNhapKhoChiTietModel);
			listPhieuNhapKhoChiTiet.add(phieuNhapKhoChiTiet);
		}
		return listPhieuNhapKhoChiTiet;
	}
	
	public void them_sua(PhieuNhapKhoChiTietModel PhieuNhapKhoChiTietModel) {
		_PhieuNhapKhoChiTiet = updateDataPhieuNhapKhoChiTietDependOnPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietModel);
		_PhieuNhapKhoChiTietDao.them_sua(_PhieuNhapKhoChiTiet);
		_listPhieuNhapKhoChiTietModels.add(PhieuNhapKhoChiTietModel);
	}

	public void updateListPhieuNhapKhoChiTietModel() {
		_PhieuNhapKhoChiTietDao.updateListPhieuNhapKhoChiTiet();
		List<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet = _PhieuNhapKhoChiTietDao.getListPhieuNhapKhoChiTiet();
		_listPhieuNhapKhoChiTietModels = updateListPhieuNhapKhoChiTietModelDependOnListPhieuNhapKhoChiTiet(listPhieuNhapKhoChiTiet);
	}

	public List<PhieuNhapKhoChiTietModel> getListPhieuNhapKhoChiTietModel() {
		return _listPhieuNhapKhoChiTietModels;
	}

}
