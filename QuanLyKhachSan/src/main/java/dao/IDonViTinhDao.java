package dao;

import java.util.ArrayList;

import entities.DonViChiTiet;
import entities.DonViTinh;
import entities.Kho;

public interface IDonViTinhDao {
	public void them_sua(DonViTinh donViTinh);
	public void updateListDonViTinh();
	public ArrayList<DonViTinh> getListDonViTinh();
}
