package com.codewithsai;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import org.hibernate.cfg.Configuration;

public class FetchStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();

        Student s1=session.find(Student.class,1);
        if(s1!=null){
            System.out.println("Student id:"+s1.getSroll());
            System.out.println("Student name:"+s1.getSname());
            System.out.println("Student Phone:"+s1.getSphone());
            System.out.println("Student address:"+s1.getSaddress());
        }
       else {
            System.out.println("Student not found");
        }
       session.close();
       factory.close();
    }
}
