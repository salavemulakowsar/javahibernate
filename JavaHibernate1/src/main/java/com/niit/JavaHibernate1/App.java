package com.niit.JavaHibernate1;



//import java.lang.module.Configuration;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
	  System.out.println( "Hello World!" );
		StudentName sname = new StudentName("salavemula", "kowsar", "kowsar");
		Student student = new Student(22,2,2,sname);
		//System.out.println(student);
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(student); 
		//session.save(student); 
		transaction.commit();

		//Student s1 = session.get(Student.class, 14);
		//System.out.println(s1);

  }
}
