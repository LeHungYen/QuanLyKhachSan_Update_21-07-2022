package dao;

import java.util.ArrayList;

import entities.SanPhamVaDichVu;

public interface ISanPhamVaDichVuDao {
	public void them_sua(SanPhamVaDichVu sanPhamVaDichVu);
	public void updateListSanPhamVaDichVu();
	public ArrayList<SanPhamVaDichVu> getListSanPhamVaDichVu();
}
