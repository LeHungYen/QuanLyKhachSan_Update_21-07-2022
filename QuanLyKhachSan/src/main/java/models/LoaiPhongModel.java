package models;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import entities.Gia;
import entities.Phong;

public class LoaiPhongModel {
	private int maLoaiPhong;
	private String tenLoai;
	private int soNguoiToiDa;
	private double giaQuaDem;
	private double giaTheoGio;
	private GiaModel giaModel;
	private List<PhongModel> listPhongModel;
	
	public LoaiPhongModel(int maLoaiPhong, String tenLoai, int soNguoiToiDa, double giaQuaDem, double giaTheoGio,
			GiaModel giaModel, List<PhongModel> listPhongModel) {
		this.maLoaiPhong = maLoaiPhong;
		this.tenLoai = tenLoai;
		this.soNguoiToiDa = soNguoiToiDa;
		this.giaQuaDem = giaQuaDem;
		this.giaTheoGio = giaTheoGio;
		this.giaModel = giaModel;
		this.listPhongModel = listPhongModel;
	}
	public LoaiPhongModel() {
	}
	public int getMaLoaiPhong() {
		return maLoaiPhong;
	}
	public void setMaLoaiPhong(int maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public int getSoNguoiToiDa() {
		return soNguoiToiDa;
	}
	public void setSoNguoiToiDa(int soNguoiToiDa) {
		this.soNguoiToiDa = soNguoiToiDa;
	}
	public double getGiaQuaDem() {
		return giaQuaDem;
	}
	public void setGiaQuaDem(double giaQuaDem) {
		this.giaQuaDem = giaQuaDem;
	}
	public double getGiaTheoGio() {
		return giaTheoGio;
	}
	public void setGiaTheoGio(double giaTheoGio) {
		this.giaTheoGio = giaTheoGio;
	}
	public GiaModel getGiaModel() {
		return giaModel;
	}
	public void setGiaModel(GiaModel giaModel) {
		this.giaModel = giaModel;
	}
	public List<PhongModel> getListPhongModel() {
		return listPhongModel;
	}
	public void setListPhongModel(List<PhongModel> listPhongModel) {
		this.listPhongModel = listPhongModel;
	}
	
	@Override
	public String toString() {
		return "LoaiPhongModel [maLoaiPhong=" + maLoaiPhong + ", tenLoai=" + tenLoai + ", soNguoiToiDa=" + soNguoiToiDa
				+ ", giaQuaDem=" + giaQuaDem + ", giaTheoGio=" + giaTheoGio + ", giaModel=" + giaModel + "]";
	}
	
	
}
