package com.patrickdizon.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.patrickdizon.test.entity.ZipCode;

@Component
public class ZipCodeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<ZipCode> getZipCodes(){
		Session session = sessionFactory.getCurrentSession();
		NativeQuery<ZipCode> query = session.createNativeQuery("select * from zip_codes order by rand() limit 5", ZipCode.class);
		return (List<ZipCode>)query.list();
	}
	
}
