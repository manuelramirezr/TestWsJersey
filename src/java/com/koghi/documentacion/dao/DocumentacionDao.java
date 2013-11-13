///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.koghi.documentacion.dao;
//
//import com.koghi.documentacion.util.HibernateFactory;
//import com.koghi.documentacion.util.Respuesta;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import javax.persistence.Query;
//import org.eclipse.persistence.sessions.Session;
//
//
///**
// *
// * @author mramirez
// */
//public class DocumentacionDao<Data> {
//    protected Respuesta<Data> respuesta = new Respuesta<Data>();
//	
//	protected Map<String, Object> parametro = new HashMap<String, Object>();
//	
//	protected final String MESSAGE_BUSQUEDA = "EXITOSO";
//    
//	protected final String MESSAGE_GUARDADO_MODIFICADO = "Registro guardado "
//            + "exitosamente!!!";
//	
//	protected Query query;
//    
//	protected Session session;
//    
//	protected boolean verificar = false;
//	
//	private HibernateFactory factory;
//	
//	private java.util.List<Data> resultado = new ArrayList<Data>();
//
//	@SuppressWarnings("static-access")
//	public DocumentacionDao() {
//		 factory = new HibernateFactory();
//		 factory.buildIfNeeded();
//	}
//	
//	/**
//     * Metodo que permite guardar o modificar un registro de la BD
//     * @param objeto
//     */
//    @SuppressWarnings("static-access")
//	protected void guardarOActualizar(Data objeto) {
//        Transaction transaction = null;
//        respuesta.setSuccess(true);
//        try {
//            session = factory.openSession();
//            transaction = session.beginTransaction();
//            session.saveOrUpdate(objeto);
//            transaction.commit();
//            respuesta.setMessage(MESSAGE_GUARDADO_MODIFICADO);
//        } catch (SQLGrammarException e) {
//            verificar = true;
//            respuesta.setMessage(e.getCause().toString());
//            transaction.rollback();
//            e.printStackTrace();
//        } catch (Exception ex) {
//            verificar = true;
//            respuesta.setMessage(ex.getMessage());
//            transaction.rollback();
//            ex.printStackTrace();
//        } finally {
//        	factory.close(session);
//        }
//
//    }
//    
//    /**
//     * Metodo que permite consultar todos los registros
//     * @param class1 La clase del objeto a consular
//     * @return Retorna el resultado de la busqueda
//     */
//    protected Respuesta<Data> consultarTodos(@SuppressWarnings("rawtypes")Class class1) {
//        this.consultar(class1, null);
//        return respuesta;
//    }
//    
//    /**
//     * Metodo que permite consular por parametros
//     * @param class1 La clase del objeto a consultar
//     * @param nombreQuery Nombre del Query a ejecutar
//     * @return Retorna el resultado de la busqueda
//     */
//    protected Respuesta<Data> consultarPorParametros(@SuppressWarnings("rawtypes")Class class1,  String nombreQuery) {
//        this.consultar(class1, nombreQuery);
//        return respuesta;
//    }
//    
//    /**
//     * Metodo comun que permite realizar la consulta
//     * @param class1
//     * @param nombreQuery Nombre del Query a ejecutar
//     * @return Retorna el resultado de la busqueda
//     */
//    @SuppressWarnings({ "unchecked", "static-access" })
//    private Respuesta<Data> consultar(@SuppressWarnings("rawtypes")Class class1, String nombreQuery) {
//        try {
//            respuesta.setSuccess(true);
//            session = factory.openSession();
//            verificarParametros(class1, nombreQuery);
//            resultado = query.list();
//            respuesta.setTotalCount(resultado.size());
//            
//            respuesta.setData(resultado);
//            respuesta.setMessage(MESSAGE_BUSQUEDA);
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//            respuesta.setMessage(e.getMessage().toString());            
//        } finally {
//        	factory.close(session);
//        }
//        return respuesta;
//    }
//    
//    /**
//     * Metodo que verifica los parametros para armar el query
//     * @param class1 Nombre de la clase a consultar
//     * @param nombreQuery Nombre del Query a ejecutar
//     * por el cual se va a buscar y el value es el valor de dicho atributo
//     */
//    private void verificarParametros(@SuppressWarnings("rawtypes") Class class1, String nombreQuery) {
//        if (!parametro.isEmpty()) {
//            query = session.getNamedQuery(class1.getSimpleName() + ".findBy"
//                    + nombreQuery);
//            asignarParametros(query);
//        } else {
//            query = session.getNamedQuery(class1.getSimpleName() + ".findAll");
//        }
//    }
//
//    private void asignarParametros(Query query) {
//        for (Iterator<?> it = parametro.keySet().iterator();
//                it.hasNext();) {
//            String atributo = String.valueOf(it.next());
//            if (parametro.get(atributo) == null) {
//                query.setParameter(atributo, null);
//            } else if (parametro.get(atributo).getClass().isArray()) {
//                query.setParameterList(atributo, (Object[]) parametro.get(atributo));
//            } else {
//                query.setParameter(atributo, parametro.get(atributo));
//            }
//        }
//    }
//
//    @SuppressWarnings("static-access")
//	protected void eliminarTransaccion(long idTransaccion) {
//        Transaction transaction = null;
//        respuesta.setSuccess(true);
//        try {
//            session = factory.openSession();
//            transaction = session.beginTransaction();
//            Query query = session.createQuery("delete from TransaccionProducto t where t.transaccion.id =:transaccion");
//            query.setParameter("transaccion", idTransaccion);
//            query.executeUpdate();
//            respuesta.setMessage(MESSAGE_GUARDADO_MODIFICADO);
//        } catch (SQLGrammarException e) {
//            verificar = true;
//            respuesta.setMessage(e.getCause().toString());
//            transaction.rollback();
//            e.printStackTrace();
//        } catch (Exception ex) {
//            verificar = true;
//            respuesta.setMessage(ex.getMessage());
//            transaction.rollback();
//            ex.printStackTrace();
//        } finally {
//        	factory.close(session);
//        }
//
//    }
//}
