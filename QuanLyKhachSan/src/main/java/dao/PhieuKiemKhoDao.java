package dao;

import java.util.ArrayList;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.PhieuKiemKho;
import utils.DB_Connection;

public class PhieuKiemKhoDao implements IPhieuKiemKhoDao{
private static ArrayList<PhieuKiemKho> _listPhieuKiemKhos = new ArrayList<PhieuKiemKho>();
	
	public void them_sua(PhieuKiemKho phieuKiemKho) {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		session.save(phieuKiemKho);
		session.getTransaction().commit();
		session.close();
	}

	public void updateListPhieuKiemKho() {
		Session session = new DB_Connection().getSession();
		session.beginTransaction();
		SQLQuery query = session.createSQLQuery("select * from PhieuKiemKho");
		query.addEntity(PhieuKiemKho.class);
		_listPhieuKiemKhos = (ArrayList<PhieuKiemKho>) query.list();
		session.getTransaction().commit();
		session.close();
		
	}

	public ArrayList<PhieuKiemKho> getListPhieuKiemKho() {
		return _listPhieuKiemKhos;
	}
}