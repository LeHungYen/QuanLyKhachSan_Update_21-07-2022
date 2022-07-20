package services;

import java.util.ArrayList;
import java.util.List;

import dao.ChucVuDao;
import dao.NhanVienDao;
import entities.ChucVu;
import entities.NhanVien;
import models.ChucVuModel;
import models.NhanVienModel;
import utils.IoCContainer;

public class ChucVuService implements IChucVuService{
	private IoCContainer ioCContainer = new IoCContainer();
	private List<ChucVuModel> _listChucVuModels = new ArrayList<ChucVuModel>();
	private ChucVuDao _chucVuDao = (ChucVuDao) ioCContainer.getBean(ChucVuDao.class.toString());
	private ChucVu _chucVu;

	public static ChucVu updateDataChucVuDependOnChucVuModel(ChucVuModel chucVuModel) {
		ChucVu chucVu = new ChucVu();
		chucVu.setMaChucVu(chucVuModel.getMaChucVu());
		chucVu.setTenChucVu(chucVuModel.getTenChucVu());
		chucVu.setTrangThai(chucVuModel.getTrangThai());
		chucVu.setListQuyen_cv(Quyen_cvService.updateListQuyen_cvDependOnListQuyen_cvModel(chucVuModel.getListQuyen_cvModel()));
		chucVu.setListNhanVien(NhanVienService.updateListNhanVienDependOnListNhanVienModel(chucVuModel.getListNhanVienModel()));
		return chucVu;
	}

	public static ChucVuModel updateDataChucVuModelDependOnChucVu(ChucVu chucVu) {
		ChucVuModel chucVuModel = new ChucVuModel();
		chucVuModel.setMaChucVu(chucVu.getMaChucVu());
		chucVuModel.setTenChucVu(chucVu.getTenChucVu());
		chucVuModel.setTrangThai(chucVu.getTrangThai());
		chucVuModel.setListQuyen_cvModel(Quyen_cvService.updateListQuyen_cvModelDependOnListQuyen_cv(chucVu.getListQuyen_cv()));
		chucVuModel.setListNhanVienModel(NhanVienService.updateListNhanVienModelDependOnListNhanVien(chucVu.getListNhanVien()));
		return chucVuModel;
	}
	
	public static List<ChucVuModel> updateListChucVuModelDependOnListChucVu (List<ChucVu> listChucVu){
		List<ChucVuModel> listChucVuModel = new ArrayList<ChucVuModel>();
		for (ChucVu chucVu : listChucVu) {
			ChucVuModel chucVuModel = updateDataChucVuModelDependOnChucVu(chucVu);
			listChucVuModel.add(chucVuModel);
		}
		return listChucVuModel;
	}
	
	public static List<ChucVu> updateListChucVuDependOnListChucVuModel (List<ChucVuModel> listChucVuModel){
		List<ChucVu> listChucVu = new ArrayList<ChucVu>();
		for (ChucVuModel chucVuModel : listChucVuModel) {
			ChucVu chucVu = updateDataChucVuDependOnChucVuModel(chucVuModel);
			listChucVu.add(chucVu);
		}
		return listChucVu;
	}
	
	public void them_sua(ChucVuModel chucVuModel) {
		_chucVu = updateDataChucVuDependOnChucVuModel(chucVuModel);
		_chucVuDao.them_sua(_chucVu);
		_listChucVuModels.add(chucVuModel);
	}

	public void updateListChucVuModel() {
		_chucVuDao.updateListChucVu();
		ArrayList<ChucVu> listChucVu = _chucVuDao.getListChucVu();
		_listChucVuModels = updateListChucVuModelDependOnListChucVu(listChucVu);

	}

	public List<ChucVuModel> getListChucVuModel() {
		return _listChucVuModels;
	}

}
