package com.klu;


import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class TestClient {
public static void main(String args[])
{
  Student s1=new Student();
 s1.setId(101);
 s1.setName("Dharani");
  s1.setEmail("Dharani@gmail.com");
  s1.setBranch("EEE");
  Configuration cfg=new Configuration();
  cfg.configure("Hibernate.cfg.xml");
  SessionFactory sf=cfg.buildSessionFactory();
  Session s=sf.openSession();
  s.save(s1);
  Transaction tx=s.beginTransaction();
  tx.commit();
}
}
