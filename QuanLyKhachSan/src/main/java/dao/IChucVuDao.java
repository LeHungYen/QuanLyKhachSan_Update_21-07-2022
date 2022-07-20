package dao;

import java.util.ArrayList;

import entities.ChucVu;


public interface IChucVuDao {
	public void them_sua(ChucVu chucVu);
	public void updateListChucVu();
	public ArrayList<ChucVu> getListChucVu();
}
