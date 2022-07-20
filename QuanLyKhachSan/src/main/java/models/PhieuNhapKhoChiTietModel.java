package models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import entities.NhanVien;
import entities.PhieuNhapKho;
import entities.PhieuNhapKhoChiTiet;
import entities.SanPhamVaDichVu;

public class PhieuNhapKhoChiTietModel {
	private PhieuNhapKhoModel phieuNhapKhoModel;
	private SanPhamVaDichVuModel sanPhamVaDichVuModel;
	private int soLuong;
	private double giaNhap;
	private String ghiChu;
	public PhieuNhapKhoChiTietModel(PhieuNhapKhoModel phieuNhapKhoModel, SanPhamVaDichVuModel sanPhamVaDichVuModel,
			int soLuong, double giaNhap, String ghiChu) {
		this.phieuNhapKhoModel = phieuNhapKhoModel;
		this.sanPhamVaDichVuModel = sanPhamVaDichVuModel;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
		this.ghiChu = ghiChu;
	}
	public PhieuNhapKhoChiTietModel() {
	}
	public PhieuNhapKhoModel getPhieuNhapKhoModel() {
		return phieuNhapKhoModel;
	}
	public void setPhieuNhapKhoModel(PhieuNhapKhoModel phieuNhapKhoModel) {
		this.phieuNhapKhoModel = phieuNhapKhoModel;
	}
	public SanPhamVaDichVuModel getSanPhamVaDichVuModel() {
		return sanPhamVaDichVuModel;
	}
	public void setSanPhamVaDichVuModel(SanPhamVaDichVuModel sanPhamVaDichVuModel) {
		this.sanPhamVaDichVuModel = sanPhamVaDichVuModel;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	@Override
	public String toString() {
		return "PhieuNhapKhoChiTietModel [phieuNhapKhoModel=" + phieuNhapKhoModel + ", sanPhamVaDichVuModel="
				+ sanPhamVaDichVuModel + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", ghiChu=" + ghiChu + "]";
	}

	
	
	
}