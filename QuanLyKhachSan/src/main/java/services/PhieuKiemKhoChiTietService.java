package services;

import java.util.ArrayList;
import java.util.List;

import dao.PhieuKiemKhoChiTietDao;
import entities.PhieuKiemKhoChiTiet;
import models.PhieuKiemKhoChiTietModel;
import utils.IoCContainer;

public class PhieuKiemKhoChiTietService implements IPhieuKiemKhoChiTietService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<PhieuKiemKhoChiTietModel> _listPhieuKiemKhoChiTietModels = new ArrayList<PhieuKiemKhoChiTietModel>();
	private PhieuKiemKhoChiTietDao _PhieuKiemKhoChiTietDao = (PhieuKiemKhoChiTietDao) ioCContainer.getBean(PhieuKiemKhoChiTietDao.class.toString());
	private PhieuKiemKhoChiTiet _PhieuKiemKhoChiTiet;

	public static PhieuKiemKhoChiTiet updateDataPhieuKiemKhoChiTietDependOnPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietModel PhieuKiemKhoChiTietModel) {
		PhieuKiemKhoChiTiet PhieuKiemKhoChiTiet = new PhieuKiemKhoChiTiet();
		PhieuKiemKhoChiTiet.setPhieuKiemKho(PhieuKiemKhoService.updateDataPhieuKiemKhoDependOnPhieuKiemKhoModel(PhieuKiemKhoChiTietModel.getPhieuKiemKhoModel()));
		PhieuKiemKhoChiTiet.setSanPhamVaDichVu(SanPhamVaDichVuService.updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(PhieuKiemKhoChiTietModel.getSanPhamVaDichVuModel()));
		PhieuKiemKhoChiTiet.setSoLuongTruocKhiKiem(PhieuKiemKhoChiTietModel.getSoLuongTruocKhiKiem());
		PhieuKiemKhoChiTiet.setSoLuongThucTe(PhieuKiemKhoChiTietModel.getSoLuongThucTe());
		PhieuKiemKhoChiTiet.setSoLuongChenhLech(PhieuKiemKhoChiTietModel.getSoLuongChenhLech());
		PhieuKiemKhoChiTiet.setGhiChuLiDoChenhLech(PhieuKiemKhoChiTietModel.getGhiChuLiDoChenhLech());
		return PhieuKiemKhoChiTiet;
	}
	public static PhieuKiemKhoChiTietModel updateDataPhieuKiemKhoChiTietModelDependOnPhieuKiemKhoChiTiet(PhieuKiemKhoChiTiet phieuKiemKhoChiTiet) {
		PhieuKiemKhoChiTietModel phieuKiemKhoChiTietModel = new PhieuKiemKhoChiTietModel();
		phieuKiemKhoChiTietModel.setPhieuKiemKhoModel(PhieuKiemKhoService.updateDataPhieuKiemKhoModelDependOnPhieuKiemKho(phieuKiemKhoChiTiet.getPhieuKiemKho()));
		phieuKiemKhoChiTietModel.setSanPhamVaDichVuModel(SanPhamVaDichVuService.updateDataSanPhamVaDichVuModelDependOnSanPhamVaDichVu(phieuKiemKhoChiTiet.getSanPhamVaDichVu()));
		phieuKiemKhoChiTietModel.setSoLuongTruocKhiKiem(phieuKiemKhoChiTiet.getSoLuongTruocKhiKiem());
		phieuKiemKhoChiTietModel.setSoLuongThucTe(phieuKiemKhoChiTiet.getSoLuongThucTe());
		phieuKiemKhoChiTietModel.setSoLuongChenhLech(phieuKiemKhoChiTiet.getSoLuongChenhLech());
		phieuKiemKhoChiTietModel.setGhiChuLiDoChenhLech(phieuKiemKhoChiTiet.getGhiChuLiDoChenhLech());
		return phieuKiemKhoChiTietModel;
	}
	
	public static List<PhieuKiemKhoChiTietModel> updateListPhieuKiemKhoChiTietModelDependOnListPhieuKiemKhoChiTiet (List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet){
		List<PhieuKiemKhoChiTietModel> litPhieuKiemKhoChiTietModel = new ArrayList<PhieuKiemKhoChiTietModel>();
		for (PhieuKiemKhoChiTiet phieuKiemKhoChiTiet : listPhieuKiemKhoChiTiet) {
			PhieuKiemKhoChiTietModel phieuKiemKhoChiTietModel = updateDataPhieuKiemKhoChiTietModelDependOnPhieuKiemKhoChiTiet(phieuKiemKhoChiTiet);
			litPhieuKiemKhoChiTietModel.add(phieuKiemKhoChiTietModel);
		}
		return litPhieuKiemKhoChiTietModel;
	}
	public static List<PhieuKiemKhoChiTiet> updateListPhieuKiemKhoChiTietDependOnListPhieuKiemKhoChiTietModel (List<PhieuKiemKhoChiTietModel> listPhieuKiemKhoChiTietModel){
		List<PhieuKiemKhoChiTiet> litPhieuKiemKhoChiTiet = new ArrayList<PhieuKiemKhoChiTiet>();
		for (PhieuKiemKhoChiTietModel phieuKiemKhoChiTietModel : listPhieuKiemKhoChiTietModel) {
			PhieuKiemKhoChiTiet phieuKiemKhoChiTiet= updateDataPhieuKiemKhoChiTietDependOnPhieuKiemKhoChiTietModel(phieuKiemKhoChiTietModel);
			litPhieuKiemKhoChiTiet.add(phieuKiemKhoChiTiet);
		}
		return litPhieuKiemKhoChiTiet;
	}

	public void them_sua(PhieuKiemKhoChiTietModel PhieuKiemKhoChiTietModel) {
		_PhieuKiemKhoChiTiet = updateDataPhieuKiemKhoChiTietDependOnPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietModel);
		_PhieuKiemKhoChiTietDao.them_sua(_PhieuKiemKhoChiTiet);
		_listPhieuKiemKhoChiTietModels.add(PhieuKiemKhoChiTietModel);
	}

	
	public void updateListPhieuKiemKhoChiTietModel() {
		_PhieuKiemKhoChiTietDao.updateListPhieuKiemKhoChiTiet();
		List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet = _PhieuKiemKhoChiTietDao.getListPhieuKiemKhoChiTiet();
		_listPhieuKiemKhoChiTietModels = updateListPhieuKiemKhoChiTietModelDependOnListPhieuKiemKhoChiTiet(listPhieuKiemKhoChiTiet);

	}

	public List<PhieuKiemKhoChiTietModel> getListPhieuKiemKhoChiTietModel() {
		return _listPhieuKiemKhoChiTietModels;
	}

}
