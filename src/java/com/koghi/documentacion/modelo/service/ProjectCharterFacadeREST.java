/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo.service;

import com.koghi.documentacion.modelo.ProjectCharter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author mramirez
 */
//@javax.ejb.Stateless
@Path("com.koghi.documentacion.modelo.projectcharter")
public class ProjectCharterFacadeREST extends AbstractFacade<ProjectCharter> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DocKoghiPU");
    private EntityManager em = emf.createEntityManager();

    public ProjectCharterFacadeREST() {
        super(ProjectCharter.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"}) 
    public ProjectCharter create(ProjectCharter entity) {
        return super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"}) 
    public ProjectCharter edit(ProjectCharter entity) {
        return super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    @Produces({"application/xml", "application/json"}) 
    public ProjectCharter remove(@PathParam("id") Integer id) {
        return super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public ProjectCharter find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<ProjectCharter> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<ProjectCharter> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
