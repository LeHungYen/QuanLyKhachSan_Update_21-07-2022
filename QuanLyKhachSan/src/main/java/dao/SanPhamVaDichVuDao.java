package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.SanPhamVaDichVu;
import utils.DB_Connection;

public class SanPhamVaDichVuDao implements ISanPhamVaDichVuDao{
	
	private static ArrayList<SanPhamVaDichVu> _listSanPhamVaDichVus = new ArrayList<SanPhamVaDichVu>();
	
	public void them_sua(SanPhamVaDichVu sanPhamVaDichVu) {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		session.save(sanPhamVaDichVu);
		session.getTransaction().commit();
		session.close();
	}
	

	public void updateListSanPhamVaDichVu() {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from SanPhamVaDichVu where trangThai ='Hoạt Động'");
		query.addEntity(SanPhamVaDichVu.class);
		_listSanPhamVaDichVus = (ArrayList<SanPhamVaDichVu>) query.list();
		session.getTransaction().commit();
		session.close();

	}

	public ArrayList<SanPhamVaDichVu> getListSanPhamVaDichVu() {
		return _listSanPhamVaDichVus;
	}

	
	
}


