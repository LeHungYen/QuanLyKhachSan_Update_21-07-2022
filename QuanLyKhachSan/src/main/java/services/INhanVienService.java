package services;

import java.util.ArrayList;
import java.util.List;

import models.NhanVienModel;

public interface INhanVienService {
	public void them_sua(NhanVienModel nhanVienModel);
	public void updateListNhanVienModel();
	public List<NhanVienModel> getListNhanVienModel();
}
