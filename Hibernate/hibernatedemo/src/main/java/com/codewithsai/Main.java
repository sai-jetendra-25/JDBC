package com.codewithsai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.setSroll(1);
       s1.setSname("Sai");
       s1.setSphone(6358470);
       s1.setSaddress("Hyderabad");
        Configuration con=new Configuration().configure();
        SessionFactory factory=con.buildSessionFactory();
        Session session=factory.openSession();


        Transaction tx=session.beginTransaction();
        session.persist(s1);

        tx.commit();

        session.close();
        factory.close();




    }
}