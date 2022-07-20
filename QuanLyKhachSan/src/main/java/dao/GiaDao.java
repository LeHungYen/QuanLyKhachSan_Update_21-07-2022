package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.Gia;
import utils.DB_Connection;

public class GiaDao implements IGiaDao{
private ArrayList<Gia> _listGias = new ArrayList<Gia>();
	
	public void them_sua(Gia Gia) {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		session.saveOrUpdate(Gia);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListGia() {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from Gia");
		query.addEntity(Gia.class);
		_listGias = (ArrayList<Gia>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<Gia> getListGia() {
		return _listGias;
	}
}
