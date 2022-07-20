package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class DichVuPhong {
	@Id
	private int maDichVuPhong;
	@ManyToOne
	private DonViChiTiet donViChiTiet;
	@ManyToOne
	private KhachTrongPhong khachTrongPhong;
	private double giaBan;
	private int soLuong;
	
	public DichVuPhong(int maDichVuPhong, DonViChiTiet donViChiTiet, KhachTrongPhong khachTrongPhong, double giaBan,
			int soLuong) {
		this.maDichVuPhong = maDichVuPhong;
		this.donViChiTiet = donViChiTiet;
		this.khachTrongPhong = khachTrongPhong;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}
	public DichVuPhong() {
		
	}
	public int getMaDichVuPhong() {
		return maDichVuPhong;
	}
	public void setMaDichVuPhong(int maDichVuPhong) {
		this.maDichVuPhong = maDichVuPhong;
	}
	public DonViChiTiet getDonViChiTiet() {
		return donViChiTiet;
	}
	public void setDonViChiTiet(DonViChiTiet donViChiTiet) {
		this.donViChiTiet = donViChiTiet;
	}
	public KhachTrongPhong getKhachTrongPhong() {
		return khachTrongPhong;
	}
	public void setKhachTrongPhong(KhachTrongPhong khachTrongPhong) {
		this.khachTrongPhong = khachTrongPhong;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "DichVuPhong [maDichVuPhong=" + maDichVuPhong + ", donViChiTiet=" + donViChiTiet + ", khachTrongPhong="
				+ khachTrongPhong + ", giaBan=" + giaBan + ", soLuong=" + soLuong + "]";
	}
	
	
	
	
}