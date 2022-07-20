package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(PhieuNhapKhoChiTiet.class)
public class PhieuNhapKhoChiTiet implements Serializable{
	@Id
	@ManyToOne
	private PhieuNhapKho phieuNhapKho;
	@Id
	@ManyToOne
	private SanPhamVaDichVu sanPhamVaDichVu;
	private int soLuong;
	private double giaNhap;
	private String ghiChu;
	public PhieuNhapKhoChiTiet(PhieuNhapKho phieuNhapKho, SanPhamVaDichVu sanPhamVaDichVu, int soLuong, double giaNhap,
			String ghiChu) {
		this.phieuNhapKho = phieuNhapKho;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
		this.ghiChu = ghiChu;
	}
	public PhieuNhapKhoChiTiet() {
		
	}
	public PhieuNhapKho getPhieuNhapKho() {
		return phieuNhapKho;
	}
	public void setPhieuNhapKho(PhieuNhapKho phieuNhapKho) {
		this.phieuNhapKho = phieuNhapKho;
	}
	public SanPhamVaDichVu getSanPhamVaDichVu() {
		return sanPhamVaDichVu;
	}
	public void setSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		this.sanPhamVaDichVu = sanPhamVaDichVu;
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
		return "PhieuNhapKhoChiTiet [phieuNhapKho=" + phieuNhapKho + ", sanPhamVaDichVu=" + sanPhamVaDichVu
				+ ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", ghiChu=" + ghiChu + "]";
	}

	
	
	
}
