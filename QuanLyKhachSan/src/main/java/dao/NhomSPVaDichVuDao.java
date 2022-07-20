package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.NhomSPVaDichVu;
import utils.DB_Connection;

public class NhomSPVaDichVuDao implements INhomSPVaDichVu{
private static ArrayList<NhomSPVaDichVu> _listNhomSPVaDichVus = new ArrayList<NhomSPVaDichVu>();
	
	public void them_sua(NhomSPVaDichVu nhomSPVaDichVu) {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		session.saveOrUpdate(nhomSPVaDichVu);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListNhomSPVaDichVu() {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from NhomSPVaDichVu");
		query.addEntity(NhomSPVaDichVu.class);
		_listNhomSPVaDichVus = (ArrayList<NhomSPVaDichVu>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<NhomSPVaDichVu> getListNhomSPVaDichVu() {
		return _listNhomSPVaDichVus;
	}
}