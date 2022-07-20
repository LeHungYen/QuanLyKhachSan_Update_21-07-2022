package models;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.swing.JOptionPane;

import entities.ChucVu;
import entities.HoaDon;
import entities.PhieuKiemKho;
import entities.PhieuNhapKho;

public class NhanVienModel {
	private String maNV;
	private String tenNV;
	private String sdt;
	private String gioiTinh;
	private String email;
	private ChucVuModel chucVuModel;
	private String trangThai;
	private String cmnd;
	private String userName;
	private String password;
	private Date ngaySinh;
	private List<PhieuNhapKhoModel> listPhieuNhapKhoModel;
	private List<PhieuKiemKhoModel> listPhieuKiemKhoModel;
	private List<HoaDonModel> listHoaDonModel;
	
	public NhanVienModel(String maNV, String tenNV, String sdt, String gioiTinh, String email, ChucVuModel chucVuModel,
			String trangThai, String cmnd, String userName, String password, Date ngaySinh,
			List<PhieuNhapKhoModel> listPhieuNhapKhoModel, List<PhieuKiemKhoModel> listPhieuKiemKhoModel,
			List<HoaDonModel> listHoaDonModel) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.chucVuModel = chucVuModel;
		this.trangThai = trangThai;
		this.cmnd = cmnd;
		this.userName = userName;
		this.password = password;
		this.ngaySinh = ngaySinh;
		this.listPhieuNhapKhoModel = listPhieuNhapKhoModel;
		this.listPhieuKiemKhoModel = listPhieuKiemKhoModel;
		this.listHoaDonModel = listHoaDonModel;
	}
	public NhanVienModel() {
	
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ChucVuModel getChucVuModel() {
		return chucVuModel;
	}
	public void setChucVuModel(ChucVuModel chucVuModel) {
		this.chucVuModel = chucVuModel;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public List<PhieuNhapKhoModel> getListPhieuNhapKhoModel() {
		return listPhieuNhapKhoModel;
	}
	public void setListPhieuNhapKhoModel(List<PhieuNhapKhoModel> listPhieuNhapKhoModel) {
		this.listPhieuNhapKhoModel = listPhieuNhapKhoModel;
	}
	public List<PhieuKiemKhoModel> getListPhieuKiemKhoModel() {
		return listPhieuKiemKhoModel;
	}
	public void setListPhieuKiemKhoModel(List<PhieuKiemKhoModel> listPhieuKiemKhoModel) {
		this.listPhieuKiemKhoModel = listPhieuKiemKhoModel;
	}
	public List<HoaDonModel> getListHoaDonModel() {
		return listHoaDonModel;
	}
	public void setListHoaDonModel(List<HoaDonModel> listHoaDonModel) {
		this.listHoaDonModel = listHoaDonModel;
	}
	
	@Override
	public String toString() {
		return "NhanVienModel [maNV=" + maNV + ", tenNV=" + tenNV + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh
				+ ", email=" + email + ", chucVuModel=" + chucVuModel + ", trangThai=" + trangThai + ", cmnd=" + cmnd
				+ ", userName=" + userName + ", password=" + password + ", ngaySinh=" + ngaySinh
				+ ", listPhieuNhapKhoModel=" + listPhieuNhapKhoModel + ", listPhieuKiemKhoModel="
				+ listPhieuKiemKhoModel + ", listHoaDonModel=" + listHoaDonModel + "]";
	}
	
	
	
}
