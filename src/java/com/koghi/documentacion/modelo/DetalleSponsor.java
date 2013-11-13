/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mramirez
 */
@Entity
@Table(name = "detalle_sponsor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleSponsor.findAll", query = "SELECT d FROM DetalleSponsor d"),
    @NamedQuery(name = "DetalleSponsor.findById", query = "SELECT d FROM DetalleSponsor d WHERE d.id = :id"),
    @NamedQuery(name = "DetalleSponsor.findByNombreFirma", query = "SELECT d FROM DetalleSponsor d WHERE d.nombreFirma = :nombreFirma"),
    @NamedQuery(name = "DetalleSponsor.findByCargoFirma", query = "SELECT d FROM DetalleSponsor d WHERE d.cargoFirma = :cargoFirma")})
public class DetalleSponsor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombre_firma")
    private String nombreFirma;
    @Basic(optional = false)
    @Column(name = "cargo_firma")
    private String cargoFirma;
    @JoinColumn(name = "sponsor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sponsor sponsorId;

    public DetalleSponsor() {
    }

    public DetalleSponsor(Long id) {
        this.id = id;
    }

    public DetalleSponsor(Long id, String nombreFirma, String cargoFirma) {
        this.id = id;
        this.nombreFirma = nombreFirma;
        this.cargoFirma = cargoFirma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreFirma() {
        return nombreFirma;
    }

    public void setNombreFirma(String nombreFirma) {
        this.nombreFirma = nombreFirma;
    }

    public String getCargoFirma() {
        return cargoFirma;
    }

    public void setCargoFirma(String cargoFirma) {
        this.cargoFirma = cargoFirma;
    }

    public Sponsor getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Sponsor sponsorId) {
        this.sponsorId = sponsorId;
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
        if (!(object instanceof DetalleSponsor)) {
            return false;
        }
        DetalleSponsor other = (DetalleSponsor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.DetalleSponsor[ id=" + id + " ]";
    }
    
}
