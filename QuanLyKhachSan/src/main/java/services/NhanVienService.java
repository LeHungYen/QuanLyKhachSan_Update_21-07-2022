package services;

import java.util.ArrayList;
import java.util.List;

import dao.NhanVienDao;
import entities.ChucVu;
import entities.SanPhamVaDichVu;
import entities.NhanVien;
import entities.PhieuNhapKho;
import models.ChucVuModel;
import models.SanPhamVaDichVuModel;
import models.NhanVienModel;
import utils.IoCContainer;

public class NhanVienService implements INhanVienService {
	private IoCContainer ioCContainer = new IoCContainer();
	private List<NhanVienModel> _listNhanVienModels = new ArrayList<NhanVienModel>();
	private NhanVienDao _nhanVienDao = (NhanVienDao) ioCContainer.getBean(NhanVienDao.class.toString());
	private NhanVien _nhanVien;
	private NhanVienModel _nhanVienModel = (NhanVienModel) IoCContainer.getBean(NhanVienModel.class.toString());;
	private int _maxID;
	
	public static NhanVien updateDataNhanVienDependOnNhanVienModel(NhanVienModel nhanVienModel) {
		NhanVien nhanVien = new NhanVien();
		nhanVien.setMaNV(nhanVienModel.getMaNV());
		nhanVien.setTenNV(nhanVienModel.getTenNV());
		nhanVien.setSdt(nhanVienModel.getSdt());
		nhanVien.setGioiTinh(nhanVienModel.getGioiTinh());
		nhanVien.setEmail(nhanVienModel.getEmail());
		nhanVien.setChucVu(ChucVuService.updateDataChucVuDependOnChucVuModel(nhanVienModel.getChucVuModel()));
		nhanVien.setTrangThai(nhanVienModel.getTrangThai());
		nhanVien.setCmnd(nhanVienModel.getCmnd());
		nhanVien.setUserName(nhanVienModel.getUserName());
		nhanVien.setPassword(nhanVienModel.getPassword());
		nhanVien.setListPhieuNhapKho(PhieuNhapKhoService.updateListPhieuNhapKhoDependOnListPhieuNhapKhoModel(nhanVienModel.getListPhieuNhapKhoModel()));
		nhanVien.setListPhieuKiemKho(PhieuKiemKhoService.updateListPhieuKiemKhoDependOnListPhieuKiemKhoModel(nhanVienModel.getListPhieuKiemKhoModel()));
		nhanVien.setListHoaDon(HoaDonService.updateListHoaDonDependOnListHoaDonModel(nhanVienModel.getListHoaDonModel()));
		nhanVien.setNgaySinh(nhanVienModel.getNgaySinh());
		return nhanVien;
		
	}
	
	public static NhanVienModel updateDataNhanVienModelDependOnNhanVien(NhanVien nhanVien) {
		NhanVienModel nhanVienModel = new NhanVienModel();
		nhanVienModel.setMaNV(nhanVien.getMaNV());
		nhanVienModel.setTenNV(nhanVien.getTenNV());
		nhanVienModel.setSdt(nhanVien.getSdt());
		nhanVienModel.setGioiTinh(nhanVien.getGioiTinh());
		nhanVienModel.setEmail(nhanVien.getEmail());
		nhanVienModel.setChucVuModel(ChucVuService.updateDataChucVuModelDependOnChucVu(nhanVien.getChucVu()));
		nhanVienModel.setTrangThai(nhanVien.getTrangThai());
		nhanVienModel.setCmnd(nhanVien.getCmnd());
		nhanVienModel.setUserName(nhanVien.getUserName());
		nhanVienModel.setPassword(nhanVien.getPassword());
		nhanVienModel.setListPhieuNhapKhoModel(PhieuNhapKhoService.updateListPhieuNhapKhoModelDependOnListPhieuNhapKho(nhanVien.getListPhieuNhapKho()));
		nhanVienModel.setListPhieuKiemKhoModel(PhieuKiemKhoService.updateListPhieuKiemKhoModelDependOnListPhieuKiemKho(nhanVien.getListPhieuKiemKho()));
		nhanVienModel.setListHoaDonModel(HoaDonService.updateListHoaDonModelDependOnListHoaDon(nhanVien.getListHoaDon()));
		nhanVienModel.setNgaySinh(nhanVienModel.getNgaySinh());
		return nhanVienModel;
	}
	
	public static List<NhanVienModel> updateListNhanVienModelDependOnListNhanVien  (List<NhanVien> listNhanVien){
		List<NhanVienModel> listNhanVienModel = new ArrayList<NhanVienModel>();
		for (NhanVien nhanVien : listNhanVien) {
			NhanVienModel nhanVienModel = updateDataNhanVienModelDependOnNhanVien(nhanVien);
			listNhanVienModel.add(nhanVienModel);
		}
		return listNhanVienModel;
	}
	
	public static List<NhanVien> updateListNhanVienDependOnListNhanVienModel  (List<NhanVienModel> listNhanVienModel){
		List<NhanVien> listNhanVien = new ArrayList<NhanVien>();
		for (NhanVienModel nhanVienModel : listNhanVienModel) {
			NhanVien nhanVien = updateDataNhanVienDependOnNhanVienModel(nhanVienModel);
			listNhanVien.add(nhanVien);
		}
		return listNhanVien;
	}
	
	public void them_sua(NhanVienModel nhanVienModel) {
		updateDataNhanVienDependOnNhanVienModel(nhanVienModel);
		_nhanVienDao.them_sua(_nhanVien);
		_listNhanVienModels.add(nhanVienModel);
	}

	
	
	public ChucVuModel updateDataChucVuModelDependOnChucVu(ChucVu chucVu) {
		ChucVuModel chucVuModel = new ChucVuModel();
		chucVuModel.setMaChucVu(chucVu.getMaChucVu());
		chucVuModel.setTenChucVu(chucVu.getTenChucVu());
		return chucVuModel;
	}
	
	public void updateListNhanVienModel() {
		_nhanVienDao.updateListNhanVien();
		List<NhanVien> listNhanVien = _nhanVienDao.getListNhanVien();
		_listNhanVienModels = updateListNhanVienModelDependOnListNhanVien(listNhanVien);
		_maxID = _nhanVienDao.getMaxID();
	}
	
	public int getMaxID() {
		return _maxID;
	}

	public List<NhanVienModel> getListNhanVienModel() {
		return _listNhanVienModels;
	}

}