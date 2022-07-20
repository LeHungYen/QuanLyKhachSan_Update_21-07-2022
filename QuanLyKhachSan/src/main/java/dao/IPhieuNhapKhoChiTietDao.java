package dao;

import java.util.ArrayList;

import entities.PhieuNhapKhoChiTiet;
import entities.ChucVu;

public interface IPhieuNhapKhoChiTietDao {
	public void them_sua(PhieuNhapKhoChiTiet phieuNhapKhoChiTiet);
	public void updateListPhieuNhapKhoChiTiet();
	public ArrayList<PhieuNhapKhoChiTiet> getListPhieuNhapKhoChiTiet();
}
