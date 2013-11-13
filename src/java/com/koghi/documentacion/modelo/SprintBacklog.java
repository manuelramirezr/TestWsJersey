/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mramirez
 */
@Entity
@Table(name = "sprint_backlog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SprintBacklog.findAll", query = "SELECT s FROM SprintBacklog s"),
    @NamedQuery(name = "SprintBacklog.findById", query = "SELECT s FROM SprintBacklog s WHERE s.id = :id"),
    @NamedQuery(name = "SprintBacklog.findByIdHistoria", query = "SELECT s FROM SprintBacklog s WHERE s.idHistoria = :idHistoria"),
    @NamedQuery(name = "SprintBacklog.findByPuntos", query = "SELECT s FROM SprintBacklog s WHERE s.puntos = :puntos"),
    @NamedQuery(name = "SprintBacklog.findByIncertidumbre", query = "SELECT s FROM SprintBacklog s WHERE s.incertidumbre = :incertidumbre")})
public class SprintBacklog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "id_historia")
    private String idHistoria;
    @Basic(optional = false)
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Lob
    @Column(name = "especificacion")
    private String especificacion;
    @Basic(optional = false)
    @Lob
    @Column(name = "alcance")
    private String alcance;
    @Basic(optional = false)
    @Column(name = "puntos")
    private int puntos;
    @Basic(optional = false)
    @Column(name = "incertidumbre")
    private int incertidumbre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sprintBacklogId")
    private Collection<ProjectCharter> projectCharterCollection;

    public SprintBacklog() {
    }

    public SprintBacklog(Long id) {
        this.id = id;
    }

    public SprintBacklog(Long id, String idHistoria, String descripcion, String especificacion, String alcance, int puntos, int incertidumbre) {
        this.id = id;
        this.idHistoria = idHistoria;
        this.descripcion = descripcion;
        this.especificacion = especificacion;
        this.alcance = alcance;
        this.puntos = puntos;
        this.incertidumbre = incertidumbre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(String idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getIncertidumbre() {
        return incertidumbre;
    }

    public void setIncertidumbre(int incertidumbre) {
        this.incertidumbre = incertidumbre;
    }

    @XmlTransient
    public Collection<ProjectCharter> getProjectCharterCollection() {
        return projectCharterCollection;
    }

    public void setProjectCharterCollection(Collection<ProjectCharter> projectCharterCollection) {
        this.projectCharterCollection = projectCharterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SprintBacklog)) {
            return false;
        }
        SprintBacklog other = (SprintBacklog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.SprintBacklog[ id=" + id + " ]";
    }
    
}
