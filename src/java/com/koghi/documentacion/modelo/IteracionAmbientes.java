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
@Table(name = "iteracion_ambientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IteracionAmbientes.findAll", query = "SELECT i FROM IteracionAmbientes i"),
    @NamedQuery(name = "IteracionAmbientes.findByIteracionambiente", query = "SELECT i FROM IteracionAmbientes i WHERE i.iteracionambiente = :iteracionambiente"),
    @NamedQuery(name = "IteracionAmbientes.findByIp", query = "SELECT i FROM IteracionAmbientes i WHERE i.ip = :ip"),
    @NamedQuery(name = "IteracionAmbientes.findByNombreHost", query = "SELECT i FROM IteracionAmbientes i WHERE i.nombreHost = :nombreHost"),
    @NamedQuery(name = "IteracionAmbientes.findByIdentificacionSwitch", query = "SELECT i FROM IteracionAmbientes i WHERE i.identificacionSwitch = :identificacionSwitch"),
    @NamedQuery(name = "IteracionAmbientes.findByRutaSwitch", query = "SELECT i FROM IteracionAmbientes i WHERE i.rutaSwitch = :rutaSwitch")})
public class IteracionAmbientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Iteracion_ambiente")
    private Long iteracionambiente;
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "nombre_host")
    private String nombreHost;
    @Basic(optional = false)
    @Column(name = "identificacion_switch")
    private String identificacionSwitch;
    @Basic(optional = false)
    @Column(name = "ruta_switch")
    private String rutaSwitch;
    @JoinColumn(name = "ambiente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ambiente ambienteId;
    @JoinColumn(name = "detalle_iteracion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DetalleIteracion detalleIteracionId;

    public IteracionAmbientes() {
    }

    public IteracionAmbientes(Long iteracionambiente) {
        this.iteracionambiente = iteracionambiente;
    }

    public IteracionAmbientes(Long iteracionambiente, String nombreHost, String identificacionSwitch, String rutaSwitch) {
        this.iteracionambiente = iteracionambiente;
        this.nombreHost = nombreHost;
        this.identificacionSwitch = identificacionSwitch;
        this.rutaSwitch = rutaSwitch;
    }

    public Long getIteracionambiente() {
        return iteracionambiente;
    }

    public void setIteracionambiente(Long iteracionambiente) {
        this.iteracionambiente = iteracionambiente;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombreHost() {
        return nombreHost;
    }

    public void setNombreHost(String nombreHost) {
        this.nombreHost = nombreHost;
    }

    public String getIdentificacionSwitch() {
        return identificacionSwitch;
    }

    public void setIdentificacionSwitch(String identificacionSwitch) {
        this.identificacionSwitch = identificacionSwitch;
    }

    public String getRutaSwitch() {
        return rutaSwitch;
    }

    public void setRutaSwitch(String rutaSwitch) {
        this.rutaSwitch = rutaSwitch;
    }

    public Ambiente getAmbienteId() {
        return ambienteId;
    }

    public void setAmbienteId(Ambiente ambienteId) {
        this.ambienteId = ambienteId;
    }

    public DetalleIteracion getDetalleIteracionId() {
        return detalleIteracionId;
    }

    public void setDetalleIteracionId(DetalleIteracion detalleIteracionId) {
        this.detalleIteracionId = detalleIteracionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iteracionambiente != null ? iteracionambiente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IteracionAmbientes)) {
            return false;
        }
        IteracionAmbientes other = (IteracionAmbientes) object;
        if ((this.iteracionambiente == null && other.iteracionambiente != null) || (this.iteracionambiente != null && !this.iteracionambiente.equals(other.iteracionambiente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.IteracionAmbientes[ iteracionambiente=" + iteracionambiente + " ]";
    }
    
}
