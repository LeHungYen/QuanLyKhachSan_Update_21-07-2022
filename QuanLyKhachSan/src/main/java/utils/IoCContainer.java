package utils;

import java.util.HashMap;
import java.util.Map;

import dao.ChucVuDao;
import dao.DichVuPhongDao;
import dao.DonViChiTietDao;
import dao.DonViTinhDao;
import dao.GiaDao;
import dao.HistoryDao;
import dao.HoaDonDao;
import dao.SanPhamVaDichVuDao;
import dao.TangDao;
import dao.IChucVuDao;
import dao.IDichVuPhongDao;
import dao.IDonViChiTietDao;
import dao.IDonViTinhDao;
import dao.IGiaDao;
import dao.IHistoryDao;
import dao.IHoaDonDao;
import dao.IKhachHangDao;
import dao.IKhachTrongPhongDao;
import dao.IKhoDao;
import dao.ILoaiPhongDao;
import dao.ISanPhamVaDichVuDao;
import dao.ITangDao;
import dao.KhachHangDao;
import dao.KhachTrongPhongDao;
import dao.KhoDao;
import dao.LoaiPhongDao;
import dao.INhanVienDao;
import dao.INhomSPVaDichVu;
import dao.IPhieuKiemKhoChiTietDao;
import dao.IPhieuKiemKhoDao;
import dao.IPhieuNhapKhoChiTietDao;
import dao.IPhieuNhapKhoDao;
import dao.IPhongDao;
import dao.IQuyenDao;
import dao.IQuyen_cvDao;
import dao.NhanVienDao;
import dao.NhomSPVaDichVuDao;
import dao.PhieuKiemKhoChiTietDao;
import dao.PhieuKiemKhoDao;
import dao.PhieuNhapKhoChiTietDao;
import dao.PhieuNhapKhoDao;
import dao.PhongDao;
import dao.QuyenDao;
import dao.Quyen_cvDao;
import entities.ChucVu;
import entities.SanPhamVaDichVu;
import models.SanPhamVaDichVuModel;
import services.ChucVuService;
import services.DichVuPhongService;
import services.DonViChiTietService;
import services.DonViTinhService;
import services.GiaService;
import services.HistoryService;
import services.HoaDonService;
import services.SanPhamVaDichVuService;
import services.TangService;
import services.IChucVuService;
import services.IDichVuPhongService;
import services.IDonViChiTietService;
import services.IDonViTinhService;
import services.IGiaService;
import services.IHistoryService;
import services.IHoaDonService;
import services.IKhachHangService;
import services.IKhachTrongPhongService;
import services.IKhoService;
import services.ILoaiPhongService;
import services.ISanPhamVaDichVuService;
import services.ITangService;
import services.KhachHangService;
import services.KhachTrongPhongService;
import services.KhoService;
import services.LoaiPhongService;
import services.INhanVienService;
import services.INhomSPvaDichVuService;
import services.IPhieuKiemKhoChiTietService;
import services.IPhieuKiemKhoService;
import services.IPhieuNhapKhoChiTietService;
import services.IPhieuNhapKhoService;
import services.IPhongService;
import services.IQuyenService;
import services.IQuyen_cvService;
import services.NhanVienService;
import services.NhomSPVaDichVuService;
import services.PhieuKiemKhoChiTietService;
import services.PhieuKiemKhoService;
import services.PhieuNhapKhoChiTietService;
import services.PhieuNhapKhoService;
import services.PhongService;
import services.QuyenService;
import services.Quyen_cvService;


public class IoCContainer {
	private static Map<String, Object> container;
	static {
		container = new HashMap<String, Object>();
	}

	public static Object getBean(String classNameSpace) {
		switch (classNameSpace) {
		
	
		case "class dao.SanPhamVaDichVuDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ISanPhamVaDichVuDao sanPhamVaDichVuDao = new SanPhamVaDichVuDao();
			container.put(classNameSpace, sanPhamVaDichVuDao);
			return sanPhamVaDichVuDao;
		case "class services.SanPhamVaDichVuService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ISanPhamVaDichVuService sanPhamVaDichVuService = new SanPhamVaDichVuService();
			container.put(classNameSpace, sanPhamVaDichVuService);
			return sanPhamVaDichVuService;
			
		case "class services.NhanVienService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			INhanVienService nhanVienService = new NhanVienService();
			container.put(classNameSpace, nhanVienService);
			return nhanVienService;
		case "class dao.NhanVienDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			INhanVienDao nhanVienDao = new NhanVienDao();
			container.put(classNameSpace, nhanVienDao);
			return nhanVienDao;
			
		case "class dao.ChucVuDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IChucVuDao chucVuDao = new ChucVuDao();
			container.put(classNameSpace, chucVuDao);
			return chucVuDao;
		case "class services.ChucVuService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IChucVuService chucVuService = new ChucVuService();
			container.put(classNameSpace, chucVuService);
			return chucVuService;
			
		case "class services.KhoService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IKhoService khoService = new KhoService();
			container.put(classNameSpace, khoService);
			return khoService;
		case "class dao.KhoDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IKhoDao khoDao = new KhoDao();
			container.put(classNameSpace, khoDao);
			return khoDao;
			
		case "class dao.NhomSPVaDichVuDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			INhomSPVaDichVu nhomSPVaDichVu = new NhomSPVaDichVuDao();
			container.put(classNameSpace, nhomSPVaDichVu);
			return nhomSPVaDichVu;
		case "class services.NhomSPVaDichVuService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			INhomSPvaDichVuService nhomSPvaDichVuService = new NhomSPVaDichVuService();
			container.put(classNameSpace, nhomSPvaDichVuService);
			return nhomSPvaDichVuService;
			
		case "class dao.PhieuKiemKhoChiTietDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuKiemKhoChiTietDao phieuKiemKhoChiTiet = new PhieuKiemKhoChiTietDao();
			container.put(classNameSpace, phieuKiemKhoChiTiet);
			return phieuKiemKhoChiTiet;
			
		case "class services.PhieuKiemKhoChiTietService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuKiemKhoChiTietService phieuKiemKhoChiTietService = new PhieuKiemKhoChiTietService();
			container.put(classNameSpace, phieuKiemKhoChiTietService);
			return phieuKiemKhoChiTietService;
			
		case "class dao.PhieuKiemKhoDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuKiemKhoDao phieuKiemKhoDao = new PhieuKiemKhoDao();
			container.put(classNameSpace, phieuKiemKhoDao);
			return phieuKiemKhoDao;
			
		case "class services.PhieuKiemKhoService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuKiemKhoService phieuKiemKhoService = new PhieuKiemKhoService();
			container.put(classNameSpace, phieuKiemKhoService);
			return phieuKiemKhoService;
			
		case "class dao.PhieuNhapKhoChiTietDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuNhapKhoChiTietDao phieuNhapKhoChiTietDao = new PhieuNhapKhoChiTietDao();
			container.put(classNameSpace, phieuNhapKhoChiTietDao);
			return phieuNhapKhoChiTietDao;
			
		case "class services.PhieuNhapKhoChiTietService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuNhapKhoChiTietService phieuNhapKhoChiTietService = new PhieuNhapKhoChiTietService();
			container.put(classNameSpace, phieuNhapKhoChiTietService);
			return phieuNhapKhoChiTietService;
			
		case "class dao.PhieuNhapKhoDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuNhapKhoDao phieuNhapKhoDao = new PhieuNhapKhoDao();
			container.put(classNameSpace, phieuNhapKhoDao);
			return phieuNhapKhoDao;
			
		case "class services.PhieuNhapKhoService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhieuNhapKhoService phieuNhapKhoService = new PhieuNhapKhoService();
			container.put(classNameSpace, phieuNhapKhoService);
			return phieuNhapKhoService;
			
		case "class dao.KhachHangDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IKhachHangDao khachHangDao = new KhachHangDao();
			container.put(classNameSpace, khachHangDao);
			return khachHangDao;
			
		case "class services.KhachHangService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IKhachHangService khachHangService = new KhachHangService();
			container.put(classNameSpace, khachHangService);
			return khachHangService;
			
		case "class dao.HistoryDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IHistoryDao historyDao = new HistoryDao();
			container.put(classNameSpace, historyDao);
			return historyDao;
			
		case "class services.HistoryService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IHistoryService historyService = new HistoryService();
			container.put(classNameSpace, historyService);
			return historyService;
			
		case "class dao.DonViTinhDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IDonViTinhDao donViTinhDao = new DonViTinhDao();
			container.put(classNameSpace, donViTinhDao);
			return donViTinhDao;
			
		case "class services.DonViTinhService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IDonViTinhService donViTinhService = new DonViTinhService();
			container.put(classNameSpace, donViTinhService);
			return donViTinhService;
			
		case "class dao.DonViChiTietDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IDonViChiTietDao donViChiTietDao = new DonViChiTietDao();
			container.put(classNameSpace, donViChiTietDao);
			return donViChiTietDao;
			
		case "class services.DonViChiTietService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IDonViChiTietService donViChiTietService = new DonViChiTietService();
			container.put(classNameSpace, donViChiTietService);
			return donViChiTietService;
			
		case "class dao.DichVuPhongDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IDichVuPhongDao dichVuPhongDao = new DichVuPhongDao();
			container.put(classNameSpace, dichVuPhongDao);
			return dichVuPhongDao;
			
		case "class services.DichVuPhongService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IDichVuPhongService dichVuPhongService = new DichVuPhongService();
			container.put(classNameSpace, dichVuPhongService);
			return dichVuPhongService;
			
		case "class dao.HoaDonDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IHoaDonDao hoaDonDao = new HoaDonDao();
			container.put(classNameSpace, hoaDonDao);
			return hoaDonDao;
			
		case "class services.HoaDonService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IHoaDonService hoaDonService = new HoaDonService();
			container.put(classNameSpace, hoaDonService);
			return hoaDonService;
			
		case "class dao.KhachTrongPhongDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IKhachTrongPhongDao khachTrongPhongDao = new KhachTrongPhongDao();
			container.put(classNameSpace, khachTrongPhongDao);
			return khachTrongPhongDao;
			
		case "class services.KhachTrongPhongService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IKhachTrongPhongService khachTrongPhongService = new KhachTrongPhongService();
			container.put(classNameSpace, khachTrongPhongService);
			return khachTrongPhongService;
			
		case "class dao.TangDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ITangDao tangDao = new TangDao();
			container.put(classNameSpace, tangDao);
			return tangDao;
			
		case "class services.TangService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ITangService tangService = new TangService();
			container.put(classNameSpace, tangService);
			return tangService;
			
		case "class dao.PhongDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhongDao phongDao = new PhongDao();
			container.put(classNameSpace, phongDao);
			return phongDao;
			
		case "class services.PhongService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IPhongService phongService = new PhongService();
			container.put(classNameSpace, phongService);
			return phongService;
			
		case "class dao.LoaiPhongDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ILoaiPhongDao loaiPhongDao = new LoaiPhongDao();
			container.put(classNameSpace, loaiPhongDao);
			return loaiPhongDao;
			
		case "class services.LoaiPhongService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			ILoaiPhongService loaiPhongService = new LoaiPhongService();
			container.put(classNameSpace, loaiPhongService);
			return loaiPhongService;
			
		case "class dao.GiaDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IGiaDao giaDao = new GiaDao();
			container.put(classNameSpace, giaDao);
			return giaDao;
			
		case "class services.GiaService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IGiaService giaService = new GiaService();
			container.put(classNameSpace, giaService);
			return giaService;
			
		case "class dao.QuyenDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IQuyenDao quyenDao = new QuyenDao();
			container.put(classNameSpace, quyenDao);
			return quyenDao;
			
		case "class services.QuyenService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IQuyenService quyenService = new QuyenService();
			container.put(classNameSpace, quyenService);
			return quyenService;
			
		case "class dao.Quyen_cvDao":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IQuyen_cvDao quyen_cvDao = new Quyen_cvDao();
			container.put(classNameSpace, quyen_cvDao);
			return quyen_cvDao;
			
		case "class services.Quyen_cvService":
			if (container.containsKey(classNameSpace)) {
				return container.get(classNameSpace);
			}
			IQuyen_cvService quyen_cvService = new Quyen_cvService();
			container.put(classNameSpace, quyen_cvService);
			return quyen_cvService;
			
		
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Quyen_cvDao.class);
	}
}
