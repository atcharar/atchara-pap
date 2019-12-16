package com.atch.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration ssr = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);  
      //  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory = ssr.buildSessionFactory();  
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();  
      
     Employee e1=new Employee();    
        e1.setId(5);    
        e1.setFirstName("shreyas");    
        e1.setLastName("iyer");    
     
   session.save(e1);  
   t.commit();  
   System.out.println("successfully saved");    
    factory.close();  
    session.close();     
    }
}
