package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

//        Laptop laptop = session.get(Laptop.class, 2);
//        Laptop laptop = session.load(Laptop.class, 2);
        Laptop laptop = session.byId(Laptop.class).getReference(2);
        System.out.println(laptop);
        session.close();

        sf.close();


    }

}