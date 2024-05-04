package StudentManagement;


import Student.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentManagement {

	public static Session connect() {
		Configuration cfg=new Configuration();
		cfg
		.addAnnotatedClass(Student.class).configure();
		
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		
		return buildSessionFactory.openSession();
	}
	
	public static void insert(Student student) {
		Session session = StudentManagement.connect();
		 Transaction t = session.beginTransaction();
		session.save(student);
		
		t.commit();
		session.close();
		
	}
	
	public static void update(Student student) {
		Session session = StudentManagement.connect();
		 Transaction t = session.beginTransaction();
		session.update(student);
		
		t.commit();
		session.close();
		
	}
	
	public static void delete(Student student) {
		Session session = StudentManagement.connect();
		 Transaction t = session.beginTransaction();
		 session.delete(student);
		 t.commit();
		 session.close();
		
	}
	
	public static void showData(int id) {
		Session session = StudentManagement.connect();
		Student s = session.get(Student.class, id);
		System.out.println(s.getId()+" "+s.getName()+" "+s.getContact()+" "+s.getAddress());
		 
	}
	
	public static void showAllData() {
		Session session = StudentManagement.connect();
		Query q = session.createQuery("from Student");
		List<Student> list = q.list();
		for(Student s:list) {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getContact()+" "+s.getAddress());
		}
		
	}
	
}
