package com.klu;


import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class TestClient1 {
public static void main(String args[])
{
  Configuration cfg=new Configuration();
  cfg.configure("Hibernate.cfg.xml");
  SessionFactory sf=cfg.buildSessionFactory();
  Session s=sf.openSession();
  Query qry=s.createQuery("select s1.id,s1.name from Student s1");
  List l=qry.list();
  Iterator it=l.iterator();
  while(it.hasNext()) {
	  Object o[] = (Object[]) it.next();
	  //Student s1=(Student)o;
	  //System.out.println(qry.l);
      //System.out.println(Student.getId() + " - " + Student.getName());
	  System.out.println("Name is:"+o[1]+"Id is:"+o[0]);



  }
  }
}
