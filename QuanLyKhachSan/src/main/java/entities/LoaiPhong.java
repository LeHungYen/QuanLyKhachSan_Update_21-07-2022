package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LoaiPhong {
	@Id
	private int maLoaiPhong;
	private String tenLoai;
	private int soNguoiToiDa;
	private double giaQuaDem;
	private double giaTheoGio;
	@ManyToOne
	private Gia gia;
	@OneToMany (mappedBy = "loaiPhong")
	private List<Phong> listPhong;
	
	public LoaiPhong(int maLoaiPhong, String tenLoai, int soNguoiToiDa, double giaQuaDem, double giaTheoGio, Gia gia,
			List<Phong> listPhong) {
		this.maLoaiPhong = maLoaiPhong;
		this.tenLoai = tenLoai;
		this.soNguoiToiDa = soNguoiToiDa;
		this.giaQuaDem = giaQuaDem;
		this.giaTheoGio = giaTheoGio;
		this.gia = gia;
		this.listPhong = listPhong;
	}
	public LoaiPhong() {
		
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
	public Gia getGia() {
		return gia;
	}
	public void setGia(Gia gia) {
		this.gia = gia;
	}
	public List<Phong> getListPhong() {
		return listPhong;
	}
	public void setListPhong(List<Phong> listPhong) {
		this.listPhong = listPhong;
	}
	@Override
	public String toString() {
		return "LoaiPhong [maLoaiPhong=" + maLoaiPhong + ", tenLoai=" + tenLoai + ", soNguoiToiDa=" + soNguoiToiDa
				+ ", giaQuaDem=" + giaQuaDem + ", giaTheoGio=" + giaTheoGio + ", gia=" + gia + ", listPhong="
				+ listPhong + "]";
	}
	
	
	
}
