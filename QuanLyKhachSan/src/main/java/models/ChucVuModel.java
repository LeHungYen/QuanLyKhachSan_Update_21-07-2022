package models;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import entities.NhanVien;
import entities.Quyen_cv;

public class ChucVuModel {
	private int maChucVu;
	private String tenChucVu;
	private String trangThai;
	private List<Quyen_cvModel> listQuyen_cvModel;
	private List<NhanVienModel> listNhanVienModel;
	
	
	
	public ChucVuModel(int maChucVu, String tenChucVu, String trangThai, List<Quyen_cvModel> listQuyen_cvModel,
			List<NhanVienModel> listNhanVienModel) {
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
		this.trangThai = trangThai;
		this.listQuyen_cvModel = listQuyen_cvModel;
		this.listNhanVienModel = listNhanVienModel;
	}
	public ChucVuModel() {
		
	}



	public int getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(int maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public List<Quyen_cvModel> getListQuyen_cvModel() {
		return listQuyen_cvModel;
	}
	public void setListQuyen_cvModel(List<Quyen_cvModel> listQuyen_cvModel) {
		this.listQuyen_cvModel = listQuyen_cvModel;
	}
	public List<NhanVienModel> getListNhanVienModel() {
		return listNhanVienModel;
	}
	public void setListNhanVienModel(List<NhanVienModel> listNhanVienModel) {
		this.listNhanVienModel = listNhanVienModel;
	}
	@Override
	public String toString() {
		return "ChucVuModel [maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + ", trangThai=" + trangThai
				+ ", listNhanVienModel=" + listNhanVienModel + "]";
	}
	
	
}
