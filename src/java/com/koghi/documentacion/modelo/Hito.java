/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mramirez
 */
@Entity
@Table(name = "hito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hito.findAll", query = "SELECT h FROM Hito h"),
    @NamedQuery(name = "Hito.findById", query = "SELECT h FROM Hito h WHERE h.id = :id"),
    @NamedQuery(name = "Hito.findByDescripcion", query = "SELECT h FROM Hito h WHERE h.descripcion = :descripcion"),
    @NamedQuery(name = "Hito.findByFechaProgramadaHito", query = "SELECT h FROM Hito h WHERE h.fechaProgramadaHito = :fechaProgramadaHito")})
public class Hito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha_programada_hito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProgramadaHito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hitoId")
    private Collection<ProjectCharter> projectCharterCollection;

    public Hito() {
    }

    public Hito(Long id) {
        this.id = id;
    }

    public Hito(Long id, String descripcion, Date fechaProgramadaHito) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaProgramadaHito = fechaProgramadaHito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaProgramadaHito() {
        return fechaProgramadaHito;
    }

    public void setFechaProgramadaHito(Date fechaProgramadaHito) {
        this.fechaProgramadaHito = fechaProgramadaHito;
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
        if (!(object instanceof Hito)) {
            return false;
        }
        Hito other = (Hito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.Hito[ id=" + id + " ]";
    }
    
}
