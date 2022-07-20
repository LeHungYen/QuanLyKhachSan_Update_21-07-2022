package entities;

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
public class SanPhamVaDichVu {
	@Id
	private int maDichVu;
	private String tenHangHoa;
	@ManyToOne
	private NhomSPVaDichVu nhomSPVaDichVu;
	private int soLuongTon;
	private double giaVon;
	@ManyToOne
	private Kho kho;
	private String moTa;
	private String trangThai;
	@OneToMany (mappedBy = "sanPhamVaDichVu")
	private List<DonViChiTiet> listDonViChiTiet;
	@OneToMany (mappedBy = "sanPhamVaDichVu")
	private List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet;
	@OneToMany (mappedBy = "sanPhamVaDichVu")
	private List<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet;
	
	
	public SanPhamVaDichVu(int maDichVu, String tenHangHoa, NhomSPVaDichVu nhomSPVaDichVu, int soLuongTon,
			double giaVon, Kho kho, String moTa, String trangThai, List<DonViChiTiet> listDonViChiTiet,
			List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet, List<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
		this.maDichVu = maDichVu;
		this.tenHangHoa = tenHangHoa;
		this.nhomSPVaDichVu = nhomSPVaDichVu;
		this.soLuongTon = soLuongTon;
		this.giaVon = giaVon;
		this.kho = kho;
		this.moTa = moTa;
		this.trangThai = trangThai;
		this.listDonViChiTiet = listDonViChiTiet;
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
		this.listPhieuNhapKhoChiTiet = listPhieuNhapKhoChiTiet;
	}
	
	public SanPhamVaDichVu() {

	}

	public int getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenHangHoa() {
		return tenHangHoa;
	}

	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}

	public NhomSPVaDichVu getNhomSPVaDichVu() {
		return nhomSPVaDichVu;
	}

	public void setNhomSPVaDichVu(NhomSPVaDichVu nhomSPVaDichVu) {
		this.nhomSPVaDichVu = nhomSPVaDichVu;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public double getGiaVon() {
		return giaVon;
	}

	public void setGiaVon(double giaVon) {
		this.giaVon = giaVon;
	}

	public Kho getKho() {
		return kho;
	}

	public void setKho(Kho kho) {
		this.kho = kho;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public List<DonViChiTiet> getListDonViChiTiet() {
		return listDonViChiTiet;
	}

	public void setListDonViChiTiet(List<DonViChiTiet> listDonViChiTiet) {
		this.listDonViChiTiet = listDonViChiTiet;
	}

	public List<PhieuKiemKhoChiTiet> getListPhieuKiemKhoChiTiet() {
		return listPhieuKiemKhoChiTiet;
	}

	public void setListPhieuKiemKhoChiTiet(List<PhieuKiemKhoChiTiet> listPhieuKiemKhoChiTiet) {
		this.listPhieuKiemKhoChiTiet = listPhieuKiemKhoChiTiet;
	}

	public List<PhieuNhapKhoChiTiet> getListPhieuNhapKhoChiTiet() {
		return listPhieuNhapKhoChiTiet;
	}

	public void setListPhieuNhapKhoChiTiet(List<PhieuNhapKhoChiTiet> listPhieuNhapKhoChiTiet) {
		this.listPhieuNhapKhoChiTiet = listPhieuNhapKhoChiTiet;
	}

	@Override
	public String toString() {
		return "SanPhamVaDichVu [maDichVu=" + maDichVu + ", tenHangHoa=" + tenHangHoa + ", nhomSPVaDichVu="
				+ nhomSPVaDichVu + ", soLuongTon=" + soLuongTon + ", giaVon=" + giaVon + ", kho=" + kho + ", moTa="
				+ moTa + ", trangThai=" + trangThai + ", listDonViChiTiet=" + listDonViChiTiet
				+ ", listPhieuKiemKhoChiTiet=" + listPhieuKiemKhoChiTiet + ", listPhieuNhapKhoChiTiet="
				+ listPhieuNhapKhoChiTiet + "]";
	}
	
	
	
	
	
	
	
	
}
