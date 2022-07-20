package dao;

import java.util.ArrayList;

import entities.PhieuNhapKhoChiTiet;
import entities.DichVuPhong;

public interface IDichVuPhongDao {
	public void them_sua(DichVuPhong dichVuPhong);
	public void updateListDichVuPhong();
	public ArrayList<DichVuPhong> getListDichVuPhong();
}
