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
@Table(name = "sponsor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sponsor.findAll", query = "SELECT s FROM Sponsor s"),
    @NamedQuery(name = "Sponsor.findById", query = "SELECT s FROM Sponsor s WHERE s.id = :id"),
    @NamedQuery(name = "Sponsor.findByNombreSponsor", query = "SELECT s FROM Sponsor s WHERE s.nombreSponsor = :nombreSponsor"),
    @NamedQuery(name = "Sponsor.findByRolProyecto", query = "SELECT s FROM Sponsor s WHERE s.rolProyecto = :rolProyecto")})
public class Sponsor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombre_sponsor")
    private String nombreSponsor;
    @Basic(optional = false)
    @Column(name = "rol_proyecto")
    private String rolProyecto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sponsorId")
    private Collection<ProjectCharter> projectCharterCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sponsorId")
    private Collection<DetalleSponsor> detalleSponsorCollection;

    public Sponsor() {
    }

    public Sponsor(Long id) {
        this.id = id;
    }

    public Sponsor(Long id, String nombreSponsor, String rolProyecto) {
        this.id = id;
        this.nombreSponsor = nombreSponsor;
        this.rolProyecto = rolProyecto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreSponsor() {
        return nombreSponsor;
    }

    public void setNombreSponsor(String nombreSponsor) {
        this.nombreSponsor = nombreSponsor;
    }

    public String getRolProyecto() {
        return rolProyecto;
    }

    public void setRolProyecto(String rolProyecto) {
        this.rolProyecto = rolProyecto;
    }

    @XmlTransient
    public Collection<ProjectCharter> getProjectCharterCollection() {
        return projectCharterCollection;
    }

    public void setProjectCharterCollection(Collection<ProjectCharter> projectCharterCollection) {
        this.projectCharterCollection = projectCharterCollection;
    }

    @XmlTransient
    public Collection<DetalleSponsor> getDetalleSponsorCollection() {
        return detalleSponsorCollection;
    }

    public void setDetalleSponsorCollection(Collection<DetalleSponsor> detalleSponsorCollection) {
        this.detalleSponsorCollection = detalleSponsorCollection;
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
        if (!(object instanceof Sponsor)) {
            return false;
        }
        Sponsor other = (Sponsor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.Sponsor[ id=" + id + " ]";
    }
    
}
