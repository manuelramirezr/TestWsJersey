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
@Table(name = "equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e"),
    @NamedQuery(name = "Equipo.findById", query = "SELECT e FROM Equipo e WHERE e.id = :id"),
    @NamedQuery(name = "Equipo.findByNombreEquipo", query = "SELECT e FROM Equipo e WHERE e.nombreEquipo = :nombreEquipo"),
    @NamedQuery(name = "Equipo.findByVelocityMaximo", query = "SELECT e FROM Equipo e WHERE e.velocityMaximo = :velocityMaximo"),
    @NamedQuery(name = "Equipo.findByVelocityActual", query = "SELECT e FROM Equipo e WHERE e.velocityActual = :velocityActual"),
    @NamedQuery(name = "Equipo.findByCantidadIntegrantes", query = "SELECT e FROM Equipo e WHERE e.cantidadIntegrantes = :cantidadIntegrantes")})
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombre_equipo")
    private String nombreEquipo;
    @Basic(optional = false)
    @Column(name = "velocity_maximo")
    private int velocityMaximo;
    @Basic(optional = false)
    @Column(name = "velocity_actual")
    private int velocityActual;
    @Basic(optional = false)
    @Column(name = "cantidad_integrantes")
    private int cantidadIntegrantes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipoId")
    private Collection<ProjectCharter> projectCharterCollection;

    public Equipo() {
    }

    public Equipo(Long id) {
        this.id = id;
    }

    public Equipo(Long id, String nombreEquipo, int velocityMaximo, int velocityActual, int cantidadIntegrantes) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.velocityMaximo = velocityMaximo;
        this.velocityActual = velocityActual;
        this.cantidadIntegrantes = cantidadIntegrantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getVelocityMaximo() {
        return velocityMaximo;
    }

    public void setVelocityMaximo(int velocityMaximo) {
        this.velocityMaximo = velocityMaximo;
    }

    public int getVelocityActual() {
        return velocityActual;
    }

    public void setVelocityActual(int velocityActual) {
        this.velocityActual = velocityActual;
    }

    public int getCantidadIntegrantes() {
        return cantidadIntegrantes;
    }

    public void setCantidadIntegrantes(int cantidadIntegrantes) {
        this.cantidadIntegrantes = cantidadIntegrantes;
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
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.Equipo[ id=" + id + " ]";
    }
    
}
