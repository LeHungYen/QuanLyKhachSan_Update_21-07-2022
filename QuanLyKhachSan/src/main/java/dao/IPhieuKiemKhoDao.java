package dao;

import java.util.ArrayList;

import entities.PhieuKiemKho;
import entities.PhieuKiemKhoChiTiet;

public interface IPhieuKiemKhoDao {
	public void them_sua(PhieuKiemKho phieuKiemKho);
	public void updateListPhieuKiemKho();
	public ArrayList<PhieuKiemKho> getListPhieuKiemKho();
}
