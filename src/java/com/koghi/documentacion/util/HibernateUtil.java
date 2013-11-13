///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.koghi.documentacion.util;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
//
///**
// * Hibernate Utility class with a convenient method to get Session Factory
// * object.
// *
// * @author mramirez
// */
//public class HibernateUtil {
//
//    private static final SessionFactory sessionFactory;
//    
//    static {
//        try {
//            // Create the SessionFactory from standard (hibernate.cfg.xml) 
//            // config file.
//            Configuration configuration = new Configuration();
//	    configuration.configure();
//	    ServiceRegistry serviceRegistry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);  //configuration.buildSessionFactory(serviceRegistry);
//    	    configuration.addClass(com.koghi.documentacion.modelo.Ambiente.class);
//            
////        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            // Log the exception. 
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//    
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//}
