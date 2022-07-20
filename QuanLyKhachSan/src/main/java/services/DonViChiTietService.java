package services;

import java.util.ArrayList;
import java.util.List;

import dao.DonViChiTietDao;
import entities.DonViChiTiet;
import models.DonViChiTietModel;
import utils.IoCContainer;

public class DonViChiTietService implements IDonViChiTietService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<DonViChiTietModel> _listDonViChiTietModels = new ArrayList<DonViChiTietModel>();
	private DonViChiTietDao _DonViChiTietDao = (DonViChiTietDao) ioCContainer.getBean(DonViChiTietDao.class.toString());
	private DonViChiTiet _DonViChiTiet;
	private DonViChiTietModel _DonViChiTietModel = (DonViChiTietModel) IoCContainer.getBean(DonViChiTietModel.class.toString());;

	public static DonViChiTiet updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel DonViChiTietModel) {
		DonViChiTiet DonViChiTiet = new DonViChiTiet();
		DonViChiTiet.setMaDonViChiTiet(DonViChiTietModel.getMaDonViChiTiet());
		DonViChiTiet.setDonViTinh(DonViTinhService.updateDataDonViTinhDependOnDonViTinhModel(DonViChiTietModel.getDonViTinhModel()));
		DonViChiTiet.setSanPhamVaDichVu(SanPhamVaDichVuService.updateDataSanPhamVaDichVuDependOnSanPhamVaDichVuModel(DonViChiTietModel.getSanPhamVaDichVuModel()));
		DonViChiTiet.setGiaTriQuyDoi(DonViChiTietModel.getGiaTriQuyDoi());
		DonViChiTiet.setGiaBan(DonViChiTietModel.getGiaBan());
		DonViChiTiet.setTrangThai(DonViChiTietModel.getTrangThai());
		DonViChiTiet.setListDichVuPhong(DichVuPhongService.updateListDichVuPhongDependOnListDichVuPhongModel(DonViChiTietModel.getListDichVuPhongModel()));
		return DonViChiTiet;
	}
	public static DonViChiTietModel updateDataDonViChiTietModelDependOnDonViChiTiet(DonViChiTiet donViChiTiet) {
		DonViChiTietModel donViChiTietModel = new DonViChiTietModel();
		donViChiTietModel.setMaDonViChiTiet(donViChiTiet.getMaDonViChiTiet());
		donViChiTietModel.setDonViTinhModel(DonViTinhService.updateDataDonViTinhModelDependOnDonViTinh(donViChiTiet.getDonViTinh()));
		donViChiTietModel.setSanPhamVaDichVuModel(SanPhamVaDichVuService.updateDataSanPhamVaDichVuModelDependOnSanPhamVaDichVu(donViChiTiet.getSanPhamVaDichVu()));
		donViChiTietModel.setGiaTriQuyDoi(donViChiTiet.getGiaTriQuyDoi());
		donViChiTietModel.setGiaBan(donViChiTiet.getGiaBan());
		donViChiTietModel.setTrangThai(donViChiTiet.getTrangThai());
		donViChiTietModel.setListDichVuPhongModel(DichVuPhongService.updateListDichVuPhongModelDependOnListDichVuPhong(donViChiTiet.getListDichVuPhong()));
		return donViChiTietModel;
	}
	
	public static List<DonViChiTiet> updateListDonViChiTietDependOnListDonViChiTietModel(List<DonViChiTietModel> listDonViChiTietModel) {
		List<DonViChiTiet> listDonViChiTiet = new ArrayList<DonViChiTiet>();
		for (DonViChiTietModel donViChiTietModel : listDonViChiTietModel) {
			DonViChiTiet donViChiTiet = updateDataDonViChiTietDependOnDonViChiTietModel(donViChiTietModel);
			listDonViChiTiet.add(donViChiTiet);
		}
		return listDonViChiTiet;
	}
	
	public static List<DonViChiTietModel> updateListDonViChiTietModelDependOnListDonViChiTiet(List<DonViChiTiet> listDonViChiTiet) {
		List<DonViChiTietModel> listDonViChiTietModel = new ArrayList<DonViChiTietModel>();
		for (DonViChiTiet donViChiTiet : listDonViChiTiet) {
			DonViChiTietModel donViChiTietModel = updateDataDonViChiTietModelDependOnDonViChiTiet(donViChiTiet);
			listDonViChiTietModel.add(donViChiTietModel);
		}
		return listDonViChiTietModel;
	}

	public void them_sua(DonViChiTietModel DonViChiTietModel) {
		_DonViChiTiet = updateDataDonViChiTietDependOnDonViChiTietModel(DonViChiTietModel);
		_DonViChiTietDao.them_sua(_DonViChiTiet);
		_listDonViChiTietModels.add(DonViChiTietModel); // check lai
	}

	
	public void updateListDonViChiTietModel() {
		_DonViChiTietDao.updateListDonViChiTiet();
		List<DonViChiTiet> listDonViChiTiet = _DonViChiTietDao.getListDonViChiTiet();
		_listDonViChiTietModels = updateListDonViChiTietModelDependOnListDonViChiTiet(listDonViChiTiet);

	}

	public List<DonViChiTietModel> getListDonViChiTietModel() {
		return _listDonViChiTietModels;
	}

}
