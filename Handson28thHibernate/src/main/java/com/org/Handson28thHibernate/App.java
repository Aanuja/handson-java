package com.org.Handson28thHibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException; 


/**
 * Hello world!
 *
 */

    	public class App {
    	  
    	   public static void main(String[] args) {
    		   
    		         
    		        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    		         
    		        Session session = sessionFactory.getCurrentSession();
    		         
    		        try {
    		            session.beginTransaction();
    	      
    	     
    	 Employee obj = new Employee();
   
          
          obj.setName("Mukesh");
          obj.setSkill("Java");
          obj.setEmail("mukesh123@gmail.com");
          
          obj.setName("Anil");
          obj.setSkill(".Net");
          obj.setEmail("anil123@gmail.com");
          
          obj.setName("Vidya");
          obj.setSkill("UI");
          obj.setEmail("vidya123@gmail.com");
          
          obj.setName("Hina");
          obj.setSkill("SQL");
          obj.setEmail("hina123@gmail.com");
          
          session.save(obj);
          session.getTransaction().commit();
       }
     catch (HibernateException e)
    		        {
    	 
    		            e.printStackTrace();
    		            session.getTransaction().rollback();
        }
    		        
    		        session = sessionFactory.getCurrentSession();     
    		        
    		        String objskill = "Java";
    		        
    		        try {
    		            session.beginTransaction();
    		             
    		            Criteria criteria = session.createCriteria(Employee.class);
    		            criteria.add(Restrictions.eq("skill", objskill));
    		             
    		            Employee obj = (Employee) criteria.uniqueResult();
    		             
    		            if (obj!=null) {
    		                System.out.println("Employee found:");
    		                System.out.println(obj.getSkill() + " - " + obj.getName() + " - "+obj.getEmail());
    		            }
    		             
    		            session.getTransaction().commit();
    		        }
    		        catch (HibernateException e) {
    		            e.printStackTrace();
    		            session.getTransaction().rollback();
    		        }
    	   }
    	}
    		         
    		    
          

          
       