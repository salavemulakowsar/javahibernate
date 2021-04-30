package com.niit.JavaHibernate1;



//import java.lang.module.Configuration;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
  public static void main(String[] args) {
  Student student = new Student(1,"kowsar",1,11);
  Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
  SessionFactory sessionFactory = configuration.buildSessionFactory();
   Session session = sessionFactory.openSession();
 // session.save(student);
  Transaction transaction = session.beginTransaction();
  
  session.save(student);
  transaction.commit();
  }
}
