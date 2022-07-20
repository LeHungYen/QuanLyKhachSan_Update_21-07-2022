package dao;

import java.util.ArrayList;

import entities.NhanVien;

public interface INhanVienDao {
	public void them_sua(NhanVien nhanVien);
	public void updateListNhanVien();
	public ArrayList<NhanVien> getListNhanVien();
}
