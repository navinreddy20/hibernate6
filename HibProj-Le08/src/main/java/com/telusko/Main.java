package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();


        s1.setRollNo(106);
        s1.setsName("Avni");
        s1.setsAge(21);

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.telusko.Student.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        s2 = session.get(Student.class, 102);

        session.close();
        sf.close();
        System.out.println(s2);

    }

}