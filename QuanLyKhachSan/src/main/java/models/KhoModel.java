package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.PhieuKiemKho;
import entities.SanPhamVaDichVu;

public class KhoModel {
	private int maKho;
	private String tenKho;
	private String trangThai;
	private List<PhieuKiemKhoModel> listPhieuKiemKhoModel;
	private List<SanPhamVaDichVuModel> listSanPhamVaDichVuModel;
	
	public KhoModel(int maKho, String tenKho, String trangThai, List<PhieuKiemKhoModel> listPhieuKiemKhoModel,
			List<SanPhamVaDichVuModel> listSanPhamVaDichVuModel) {
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.trangThai = trangThai;
		this.listPhieuKiemKhoModel = listPhieuKiemKhoModel;
		this.listSanPhamVaDichVuModel = listSanPhamVaDichVuModel;
	}
	public KhoModel() {
	}
	public int getMaKho() {
		return maKho;
	}
	public void setMaKho(int maKho) {
		this.maKho = maKho;
	}
	public String getTenKho() {
		return tenKho;
	}
	public void setTenKho(String tenKho) {
		this.tenKho = tenKho;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public List<PhieuKiemKhoModel> getListPhieuKiemKhoModel() {
		return listPhieuKiemKhoModel;
	}
	public void setListPhieuKiemKhoModel(List<PhieuKiemKhoModel> listPhieuKiemKhoModel) {
		this.listPhieuKiemKhoModel = listPhieuKiemKhoModel;
	}
	public List<SanPhamVaDichVuModel> getListSanPhamVaDichVuModel() {
		return listSanPhamVaDichVuModel;
	}
	public void setListSanPhamVaDichVuModel(List<SanPhamVaDichVuModel> listSanPhamVaDichVuModel) {
		this.listSanPhamVaDichVuModel = listSanPhamVaDichVuModel;
	}
	@Override
	public String toString() {
		return "KhoModel [maKho=" + maKho + ", tenKho=" + tenKho + ", trangThai=" + trangThai
				+ ", listPhieuKiemKhoModel=" + listPhieuKiemKhoModel + ", listSanPhamVaDichVuModel="
				+ listSanPhamVaDichVuModel + "]";
	}
	
	
}
