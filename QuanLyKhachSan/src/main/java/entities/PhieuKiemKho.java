package entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class PhieuKiemKho {
	@Id
	private int maKiemKho;
	private Date ngayKiemKho;
	@ManyToOne
	private NhanVien nhanVien;
	@ManyToOne
	private Kho kho;
	@OneToMany (mappedBy = "phieuKiemKho")
	private List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet;
	
	public PhieuKiemKho(int maKiemKho, Date ngayKiemKho, NhanVien nhanVien, Kho kho,
			List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.maKiemKho = maKiemKho;
		this.ngayKiemKho = ngayKiemKho;
		this.nhanVien = nhanVien;
		this.kho = kho;
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}
	public PhieuKiemKho() {
		
	}
	public int getMaKiemKho() {
		return maKiemKho;
	}
	public void setMaKiemKho(int maKiemKho) {
		this.maKiemKho = maKiemKho;
	}
	public Date getNgayKiemKho() {
		return ngayKiemKho;
	}
	public void setNgayKiemKho(Date ngayKiemKho) {
		this.ngayKiemKho = ngayKiemKho;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public Kho getKho() {
		return kho;
	}
	public void setKho(Kho kho) {
		this.kho = kho;
	}
	public List<PhieuKiemKhoChiTiet> getListPhieuKiemKhoChiTiet() {
		return listPhieuKiemKhoChiTiet;
	}
	public void setListPhieuKiemKhoChiTiet(List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}
	@Override
	public String toString() {
		return "PhieuKiemKho [maKiemKho=" + maKiemKho + ", ngayKiemKho=" + ngayKiemKho + ", nhanVien=" + nhanVien
				+ ", kho=" + kho + ", listPhieuKiemKhoChiTiet=" + listPhieuKiemKhoChiTiet + "]";
	}
	

	
}
