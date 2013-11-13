/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.dao;

import com.koghi.documentacion.modelo.Ambiente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mramirez
 */
public class TestDao {
    public static void main(String[] args) {
//        @PersistenceContext(unitName = "DocKoghiPU")
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DocKoghiPU");
        EntityManager em = emf.createEntityManager();
        
        
//        SessionFactory sf = new Configuration().configure().buildSessionFactory();
//        Session session = sf.openSession();
//        session.beginTransaction();
//
//        Ambiente ambiente = new Ambiente();
//        ambiente.setDescripcionAmbiente("Prueba");
//        session.save(ambiente);
//        session.getTransaction().commit();
//        session.close();

        
//        Session session =  HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//       Ambiente ambiente = new Ambiente();
//
//       ambiente.setDescripcionAmbiente("Prueba");
//
//       session.save(ambiente);
//       session.getTransaction().commit();
        Ambiente ambiente = new Ambiente();
        ambiente.setDescripcionAmbiente("QA");
        em.persist(ambiente);
//        DocumentacionDao<Ambiente> dao = new DocumentacionDao<Ambiente>();
//        dao.guardarOActualizar(ambiente);
    }
}
