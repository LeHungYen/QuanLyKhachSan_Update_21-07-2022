package dao;

import java.util.ArrayList;

import entities.DichVuPhong;
import entities.DonViChiTiet;

public interface IDonViChiTietDao {
	public void them_sua(DonViChiTiet donViChiTiet);
	public void updateListDonViChiTiet();
	public ArrayList<DonViChiTiet> getListDonViChiTiet();
}
