package com.codewithsai;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;


public class DeleteStudent
{
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Student s1=session.find(Student.class,1);
        session.remove(s1);
        session.close();
        factory.close();
    }
}
