//package com.koghi.documentacion.util;
//
//import javax.imageio.spi.ServiceRegistry;
//import javax.security.auth.login.Configuration;
//import org.eclipse.persistence.sessions.Session;
//import org.eclipse.persistence.sessions.factories.SessionFactory;
//
//public class HibernateFactory {
//	
//    private static SessionFactory sessionFactory;
//
//
//    /**
//     * Constructs a new Singleton SessionFactory
//     * @return
//     * @throws HibernateException
//     */
//    public static SessionFactory buildSessionFactory() throws HibernateException {
//        if (sessionFactory != null) {
//            closeFactory();
//        }
//        return configureSessionFactory();
//    }
//
//    /**
//     * Builds a SessionFactory, if it hasn't been already.
//     */
//    public static SessionFactory buildIfNeeded() throws HibernateException{
//        if (sessionFactory != null) {
//            return sessionFactory;
//        }
//
//            return configureSessionFactory();
//
//    }
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//
//    public static Session openSession() throws HibernateException {
//    	sessionFactory = buildIfNeeded();
//        return sessionFactory.openSession();
//    }
//
//    public static void closeFactory() {
//        if (sessionFactory != null) {
//            try {
//                sessionFactory.close();
//            } catch (HibernateException ignored) {
//                ignored.printStackTrace();
//            }
//        }
//    }
//
//    public static void close(Session session) {
//        if (session != null && session.isOpen()) {
//            try {
//                session.close();
//            } catch (HibernateException ignored) {
//                ignored.printStackTrace();
//            }
//        }
//    }
//
//    public static void rollback(Transaction tx) {
//        try {
//            if (tx != null) {
//                tx.rollback();
//            }
//        } catch (HibernateException ignored) {
//        	ignored.printStackTrace();
//        }
//    }
//    /**
//     *
//     * @return
//     * @throws HibernateException
//     */
//    private static SessionFactory configureSessionFactory() throws HibernateException {
//    	//sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//    	Configuration configuration = new Configuration();
//	    configuration.configure();
//	    ServiceRegistry serviceRegistry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
//	    sessionFactory = configuration.buildSessionFactory();  //configuration.buildSessionFactory(serviceRegistry);
//    	    
//        return sessionFactory;
//    }
//
//}
