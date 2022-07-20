package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;

@Entity
public class Gia {
	@Id
	private int maGia;
	private String gioCheckIn;
	private String gioCheckOut;
	private double phatCheckInSom;
	private double phatCheckOutMuon;
	@OneToMany (mappedBy = "gia")
	private List<LoaiPhong> listLoaiPhong;
	
	public Gia(int maGia, String gioCheckIn, String gioCheckOut, double phatCheckInSom, double phatCheckOutMuon,
			List<LoaiPhong> listLoaiPhong) {
		this.maGia = maGia;
		this.gioCheckIn = gioCheckIn;
		this.gioCheckOut = gioCheckOut;
		this.phatCheckInSom = phatCheckInSom;
		this.phatCheckOutMuon = phatCheckOutMuon;
		this.listLoaiPhong = listLoaiPhong;
	}
	public Gia() {
	}
	public int getMaGia() {
		return maGia;
	}
	public void setMaGia(int maGia) {
		this.maGia = maGia;
	}
	public String getGioCheckIn() {
		return gioCheckIn;
	}
	public void setGioCheckIn(String gioCheckIn) {
		this.gioCheckIn = gioCheckIn;
	}
	public String getGioCheckOut() {
		return gioCheckOut;
	}
	public void setGioCheckOut(String gioCheckOut) {
		this.gioCheckOut = gioCheckOut;
	}
	public double getPhatCheckInSom() {
		return phatCheckInSom;
	}
	public void setPhatCheckInSom(double phatCheckInSom) {
		this.phatCheckInSom = phatCheckInSom;
	}
	public double getPhatCheckOutMuon() {
		return phatCheckOutMuon;
	}
	public void setPhatCheckOutMuon(double phatCheckOutMuon) {
		this.phatCheckOutMuon = phatCheckOutMuon;
	}
	public List<LoaiPhong> getListLoaiPhong() {
		return listLoaiPhong;
	}
	public void setListLoaiPhong(List<LoaiPhong> listLoaiPhong) {
		this.listLoaiPhong = listLoaiPhong;
	}
	@Override
	public String toString() {
		return "Gia [maGia=" + maGia + ", gioCheckIn=" + gioCheckIn + ", gioCheckOut=" + gioCheckOut
				+ ", phatCheckInSom=" + phatCheckInSom + ", phatCheckOutMuon=" + phatCheckOutMuon + ", listLoaiPhong="
				+ listLoaiPhong + "]";
	}
	
	
	
}
