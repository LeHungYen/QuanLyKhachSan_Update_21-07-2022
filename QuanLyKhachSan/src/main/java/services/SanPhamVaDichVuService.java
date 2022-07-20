package services;

import java.util.ArrayList;
import java.util.List;

import dao.SanPhamVaDichVuDao;
import dao.SanPhamVaDichVuDao;
import entities.SanPhamVaDichVu;
import entities.SanPhamVaDichVu;
import utils.IoCContainer;
import models.SanPhamVaDichVuModel;
import models.SanPhamVaDichVuModel;
public class SanPhamVaDichVuService implements ISanPhamVaDichVuService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<SanPhamVaDichVuModel> _listSanPhamVaDichVuModels = new ArrayList<SanPhamVaDichVuModel>();
	private SanPhamVaDichVuDao _SanPhamVaDichVuDao = (SanPhamVaDichVuDao) ioCContainer.getBean(SanPhamVaDichVuDao.class.toString());
	private SanPhamVaDichVu _SanPhamVaDichVu;

	public static SanPhamVaDichVu updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(SanPhamVaDichVuModel SanPhamVaDichVuModel) {
		SanPhamVaDichVu SanPhamVaDichVu = new SanPhamVaDichVu();
		SanPhamVaDichVu.setMaDichVu(SanPhamVaDichVuModel.getMaDichVu());
		SanPhamVaDichVu.setTenHangHoa(SanPhamVaDichVuModel.getTenHangHoa());
		SanPhamVaDichVu.setNhomSPVaDichVu(NhomSPVaDichVuService.updateDataNhomSPVaDichVuDependOnNhomSPVaDichVuModel(SanPhamVaDichVuModel.getNhomSPVaDichVuModel()));
		SanPhamVaDichVu.setSoLuongTon(SanPhamVaDichVuModel.getSoLuongTon());
		SanPhamVaDichVu.setGiaVon(SanPhamVaDichVuModel.getGiaVon());
		SanPhamVaDichVu.setKho(KhoService.updateDataKhoDependOnKhoModel(SanPhamVaDichVuModel.getKhoModel()));
		SanPhamVaDichVu.setMoTa(SanPhamVaDichVuModel.getMoTa());
		SanPhamVaDichVu.setTrangThai(SanPhamVaDichVuModel.getTrangThai());
		SanPhamVaDichVu.setListDonViChiTiet(DonViChiTietService.updateListDonViChiTietDependOnListDonViChiTietModel(SanPhamVaDichVuModel.getListDonViChiTietModel()));
		SanPhamVaDichVu.setListPhieuKiemKhoChiTiet(PhieuKiemKhoChiTietService.updateListPhieuKiemKhoChiTietDependOnListPhieuKiemKhoChiTietModel(SanPhamVaDichVuModel.getListPhieuKiemKhoChiTietModel()));
		SanPhamVaDichVu.setListPhieuNhapKhoChiTiet(PhieuNhapKhoChiTietService.updateListPhieuNhapKhoChiTietDependOnListPhieuNhapKhoChiTietModel(SanPhamVaDichVuModel.getListPhieuNhapKhoChiTietModel()));
		return SanPhamVaDichVu;
	}
	
	public static SanPhamVaDichVuModel updateDataSanPhamVaDichVuModelDependOnSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		SanPhamVaDichVuModel sanPhamVaDichVuModel = new SanPhamVaDichVuModel();
		sanPhamVaDichVuModel.setMaDichVu(sanPhamVaDichVu.getMaDichVu());
		sanPhamVaDichVuModel.setTenHangHoa(sanPhamVaDichVu.getTenHangHoa());
		sanPhamVaDichVuModel.setNhomSPVaDichVuModel(NhomSPVaDichVuService.updateDataNhomSPVaDichVuModelDependOnNhomSPVaDichVu(sanPhamVaDichVu.getNhomSPVaDichVu()));
		sanPhamVaDichVuModel.setSoLuongTon(sanPhamVaDichVu.getSoLuongTon());
		sanPhamVaDichVuModel.setGiaVon(sanPhamVaDichVu.getGiaVon());
		sanPhamVaDichVuModel.setKhoModel(KhoService.updateDataKhoModelDependOnKho(sanPhamVaDichVu.getKho()));
		sanPhamVaDichVuModel.setMoTa(sanPhamVaDichVu.getMoTa());
		sanPhamVaDichVuModel.setTrangThai(sanPhamVaDichVu.getTrangThai());
		sanPhamVaDichVuModel.setListDonViChiTietModel(DonViChiTietService.updateListDonViChiTietModelDependOnListDonViChiTiet(sanPhamVaDichVu.getListDonViChiTiet()));
		sanPhamVaDichVuModel.setListPhieuKiemKhoChiTietModel(PhieuKiemKhoChiTietService.updateListPhieuKiemKhoChiTietModelDependOnListPhieuKiemKhoChiTiet(sanPhamVaDichVu.getListPhieuKiemKhoChiTiet()));
		sanPhamVaDichVuModel.setListPhieuNhapKhoChiTietModel(PhieuNhapKhoChiTietService.updateListPhieuNhapKhoChiTietModelDependOnListPhieuNhapKhoChiTiet(sanPhamVaDichVu.getListPhieuNhapKhoChiTiet()));
		return sanPhamVaDichVuModel;
	}
	
	public static List<SanPhamVaDichVuModel> updateListSanPhamVaDichVuModelDependOnListSanPhamVaDichVu (List<SanPhamVaDichVu> listSanPhamVaDichVu){
		List<SanPhamVaDichVuModel> listSanPhamVaDichVuModel = new ArrayList<SanPhamVaDichVuModel>();
		for (SanPhamVaDichVu sanPhamVaDichVu : listSanPhamVaDichVu) {
			SanPhamVaDichVuModel sanPhamVaDichVuModel = updateDataSanPhamVaDichVuModelDependOnSanPhamVaDichVu(sanPhamVaDichVu);
			listSanPhamVaDichVuModel.add(sanPhamVaDichVuModel);
		}
		return listSanPhamVaDichVuModel;
	}
	public static List<SanPhamVaDichVu> updateListSanPhamVaDichVuDependOnListSanPhamVaDichVuModel (List<SanPhamVaDichVuModel> listSanPhamVaDichVuModel){
		List<SanPhamVaDichVu> listSanPhamVaDichVu = new ArrayList<SanPhamVaDichVu>();
		for (SanPhamVaDichVuModel sanPhamVaDichVuModel : listSanPhamVaDichVuModel) {
			SanPhamVaDichVu sanPhamVaDichVu = updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(sanPhamVaDichVuModel);
			listSanPhamVaDichVu.add(sanPhamVaDichVu);
		}
		return listSanPhamVaDichVu;
	}

	public void them_sua(SanPhamVaDichVuModel SanPhamVaDichVuModel) {
		_SanPhamVaDichVu = updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(SanPhamVaDichVuModel);
		_SanPhamVaDichVuDao.them_sua(_SanPhamVaDichVu);
		_listSanPhamVaDichVuModels.add( SanPhamVaDichVuModel); // check lai
	}

	public void updateListSanPhamVaDichVuModel() {
		_SanPhamVaDichVuDao.updateListSanPhamVaDichVu();
		List<SanPhamVaDichVu> listSanPhamVaDichVu = _SanPhamVaDichVuDao.getListSanPhamVaDichVu();
		_listSanPhamVaDichVuModels = updateListSanPhamVaDichVuModelDependOnListSanPhamVaDichVu(listSanPhamVaDichVu);
	}

	public List<SanPhamVaDichVuModel> getListSanPhamVaDichVuModel() {
		return _listSanPhamVaDichVuModels;
	}

}
