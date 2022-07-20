package services;

import java.util.ArrayList;
import java.util.List;

import models.SanPhamVaDichVuModel;

public interface ISanPhamVaDichVuService {
	public void them_sua(SanPhamVaDichVuModel sanPhamVaDichVuModel);
	public void updateListSanPhamVaDichVuModel();
	public List<SanPhamVaDichVuModel> getListSanPhamVaDichVuModel();
}
