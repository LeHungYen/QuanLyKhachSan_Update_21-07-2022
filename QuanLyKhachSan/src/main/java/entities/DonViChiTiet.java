package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class DonViChiTiet {
	@Id
	private int maDonViChiTiet;
	@ManyToOne
	DonViTinh donViTinh;
	@ManyToOne
	SanPhamVaDichVu sanPhamVaDichVu;
	private int giaTriQuyDoi;
	private double giaBan;
	private String trangThai;
	@OneToMany (mappedBy = "donViChiTiet")
	private List<DichVuPhong> listDichVuPhong;
	public DonViChiTiet(int maDonViChiTiet, DonViTinh donViTinh, SanPhamVaDichVu sanPhamVaDichVu, int giaTriQuyDoi,
			double giaBan, String trangThai, List<DichVuPhong> listDichVuPhong) {
		this.maDonViChiTiet = maDonViChiTiet;
		this.donViTinh = donViTinh;
		this.sanPhamVaDichVu = sanPhamVaDichVu;
		this.giaTriQuyDoi = giaTriQuyDoi;
		this.giaBan = giaBan;
		this.trangThai = trangThai;
		this.listDichVuPhong = listDichVuPhong;
	}
	public DonViChiTiet() {
	}
	public int getMaDonViChiTiet() {
		return maDonViChiTiet;
	}
	public void setMaDonViChiTiet(int maDonViChiTiet) {
		this.maDonViChiTiet = maDonViChiTiet;
	}
	public DonViTinh getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(DonViTinh donViTinh) {
		this.donViTinh = donViTinh;
	}
	public SanPhamVaDichVu getSanPhamVaDichVu() {
		return sanPhamVaDichVu;
	}
	public void setSanPhamVaDichVu(SanPhamVaDichVu sanPhamVaDichVu) {
		this.sanPhamVaDichVu = sanPhamVaDichVu;
	}
	public int getGiaTriQuyDoi() {
		return giaTriQuyDoi;
	}
	public void setGiaTriQuyDoi(int giaTriQuyDoi) {
		this.giaTriQuyDoi = giaTriQuyDoi;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public List<DichVuPhong> getListDichVuPhong() {
		return listDichVuPhong;
	}
	public void setListDichVuPhong(List<DichVuPhong> listDichVuPhong) {
		this.listDichVuPhong = listDichVuPhong;
	}
	@Override
	public String toString() {
		return "DonViChiTiet [maDonViChiTiet=" + maDonViChiTiet + ", donViTinh=" + donViTinh + ", sanPhamVaDichVu="
				+ sanPhamVaDichVu + ", giaTriQuyDoi=" + giaTriQuyDoi + ", giaBan=" + giaBan + ", trangThai=" + trangThai
				+ ", listDichVuPhong=" + listDichVuPhong + "]";
	}
	
	
	
	
}
