package com.codewithsai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent
{
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, 1);
        s.setSname("Sai Jetendra");
        s.setSaddress("Bangalore");
        session.merge(s);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("Student Updated!");
    }
}
