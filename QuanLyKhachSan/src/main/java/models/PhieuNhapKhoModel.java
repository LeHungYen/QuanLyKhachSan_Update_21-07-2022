package models;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import entities.PhieuNhapKhoChiTiet;
import entities.HoaDon;
import entities.NhanVien;

public class PhieuNhapKhoModel {
	private int maNhap;
	private String ghiChu;
	private Date ngayNhap;
	private String tinhTrang;
	private NhanVienModel nhanVienModel;
	private double giamGia;
	private double vat;
	private double phiShip;
	private List<PhieuNhapKhoChiTietModel> listPhieuNhapKhoChiTietModel;
	
	public PhieuNhapKhoModel(int maNhap, String ghiChu, Date ngayNhap, String tinhTrang,
			NhanVienModel nhanVienModel, double giamGia, double vat, double phiShip,
			List<PhieuNhapKhoChiTietModel> listPhieuNhapKhoChiTietModel) {
		this.maNhap = maNhap;
		this.ghiChu = ghiChu;
		this.ngayNhap = ngayNhap;
		this.tinhTrang = tinhTrang;
		this.nhanVienModel = nhanVienModel;
		this.giamGia = giamGia;
		this.vat = vat;
		this.phiShip = phiShip;
		this.listPhieuNhapKhoChiTietModel = listPhieuNhapKhoChiTietModel;
	}
	public PhieuNhapKhoModel() {
		
	}
	public int getMaNhap() {
		return maNhap;
	}
	public void setMaNhap(int maNhap) {
		this.maNhap = maNhap;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public NhanVienModel getNhanVienModel() {
		return nhanVienModel;
	}
	public void setNhanVienModel(NhanVienModel nhanVienModel) {
		this.nhanVienModel = nhanVienModel;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getPhiShip() {
		return phiShip;
	}
	public void setPhiShip(double phiShip) {
		this.phiShip = phiShip;
	}
	public List<PhieuNhapKhoChiTietModel> getListPhieuNhapKhoChiTietModel() {
		return listPhieuNhapKhoChiTietModel;
	}
	public void setListPhieuNhapKhoChiTietModel(List<PhieuNhapKhoChiTietModel> listPhieuNhapKhoChiTietModel) {
		this.listPhieuNhapKhoChiTietModel = listPhieuNhapKhoChiTietModel;
	}
	@Override
	public String toString() {
		return "PhieuNhapKhoChiTietModel [maNhap=" + maNhap + ", ghiChu=" + ghiChu + ", ngayNhap=" + ngayNhap
				+ ", tinhTrang=" + tinhTrang + ", nhanVienModel=" + nhanVienModel + ", giamGia=" + giamGia + ", vat="
				+ vat + ", phiShip=" + phiShip + ", listPhieuNhapKhoChiTietModel=" + listPhieuNhapKhoChiTietModel + "]";
	}
	
}
