package models;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import entities.DonViChiTiet;
import entities.DonViTinh;
import entities.HoaDon;
import entities.KhachHang;
import entities.KhachTrongPhong;
import entities.Phong;
import entities.SanPhamVaDichVu;

public class DichVuPhongModel {
	private int maDichVuPhong;
	private	DonViChiTietModel donViChiTietModel;
	private KhachTrongPhongModel khachTrongPhongModel;
	private double giaBan;
	private int soLuong;
	
	public DichVuPhongModel(int maDichVuPhong, DonViChiTietModel donViChiTietModel,
			KhachTrongPhongModel khachTrongPhongModel, double giaBan, int soLuong) {
		this.maDichVuPhong = maDichVuPhong;
		this.donViChiTietModel = donViChiTietModel;
		this.khachTrongPhongModel = khachTrongPhongModel;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}
	
	public DichVuPhongModel() {
	}

	public int getMaDichVuPhong() {
		return maDichVuPhong;
	}

	public void setMaDichVuPhong(int maDichVuPhong) {
		this.maDichVuPhong = maDichVuPhong;
	}

	public DonViChiTietModel getDonViChiTietModel() {
		return donViChiTietModel;
	}

	public void setDonViChiTietModel(DonViChiTietModel donViChiTietModel) {
		this.donViChiTietModel = donViChiTietModel;
	}

	public KhachTrongPhongModel getKhachTrongPhongModel() {
		return khachTrongPhongModel;
	}

	public void setKhachTrongPhongModel(KhachTrongPhongModel khachTrongPhongModel) {
		this.khachTrongPhongModel = khachTrongPhongModel;
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
		return "DichVuPhongModel [maDichVuPhong=" + maDichVuPhong + ", donViChiTietModel=" + donViChiTietModel
				+ ", khachTrongPhongModel=" + khachTrongPhongModel + ", giaBan=" + giaBan + ", soLuong=" + soLuong
				+ "]";
	}
	
	
	
	
}
