package services;

import java.util.ArrayList;
import java.util.List;

import models.ChucVuModel;
import models.SanPhamVaDichVuModel;

public interface IChucVuService {
	public void them_sua(ChucVuModel chucVuModel);
	public void updateListChucVuModel();
	public List<ChucVuModel> getListChucVuModel();
}
