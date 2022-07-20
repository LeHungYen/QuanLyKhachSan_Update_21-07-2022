package services;

import java.util.List;

import entities.Kho;
import models.KhoModel;

public interface IKhoService {
//	public Kho updateDataKhoDependOnKhoModel(KhoModel KhoModel);
//	public KhoModel updateDataKhoModelDependOnKho(Kho kho);
//	public List<Kho> updateListKhoDependOnListKhoModel(List<KhoModel> listKhoModel);
//	public List<KhoModel> updateListKhoModelDependOnListKho(List<Kho> listKho);
	public void them_sua(KhoModel KhoModel);
	public void updateListKhoModel();
	public List<KhoModel> getListKhoModel();
}
