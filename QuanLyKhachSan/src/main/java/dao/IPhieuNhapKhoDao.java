package dao;

import java.util.ArrayList;

import entities.NhanVien;
import entities.PhieuNhapKho;

public interface IPhieuNhapKhoDao {
	public void them_sua(PhieuNhapKho phieuNhapKho);
	public void updateListPhieuNhapKho();
	public ArrayList<PhieuNhapKho> getListPhieuNhapKho();
}
