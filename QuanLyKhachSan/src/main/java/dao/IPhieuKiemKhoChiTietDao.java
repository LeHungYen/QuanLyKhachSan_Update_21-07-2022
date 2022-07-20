package dao;

import java.util.ArrayList;

import entities.Kho;
import entities.PhieuKiemKhoChiTiet;

public interface IPhieuKiemKhoChiTietDao {
	public void them_sua(PhieuKiemKhoChiTiet phieuKiemKhoChiTiet);
	public void updateListPhieuKiemKhoChiTiet();
	public ArrayList<PhieuKiemKhoChiTiet> getListPhieuKiemKhoChiTiet();
}
