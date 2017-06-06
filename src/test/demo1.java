package test;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.junit.Test;

import entity.Teacher;
import utils.HibernateUtils1;

public class demo1 {
	@Test
	public void test1(){
		Session session=HibernateUtils1.getSession();
		session.beginTransaction();
		Teacher teacher=new Teacher();
		teacher.setTname("ÍõÎå");
		session.getTransaction().commit();
		session.save(teacher);
		System.out.println("222");
		session.close();
	}

}
