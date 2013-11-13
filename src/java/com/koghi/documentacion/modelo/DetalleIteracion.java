/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
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
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author mramirez
 */
@Entity
@Table(name = "detalle_iteracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleIteracion.findAll", query = "SELECT d FROM DetalleIteracion d"),
    @NamedQuery(name = "DetalleIteracion.findById", query = "SELECT d FROM DetalleIteracion d WHERE d.id = :id"),
    @NamedQuery(name = "DetalleIteracion.findByCodigoIteracion", query = "SELECT d FROM DetalleIteracion d WHERE d.codigoIteracion = :codigoIteracion"),
    @NamedQuery(name = "DetalleIteracion.findByNombreCliente", query = "SELECT d FROM DetalleIteracion d WHERE d.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "DetalleIteracion.findByLetraNumeroIteracion", query = "SELECT d FROM DetalleIteracion d WHERE d.letraNumeroIteracion = :letraNumeroIteracion"),
    @NamedQuery(name = "DetalleIteracion.findByNumeroIteracion", query = "SELECT d FROM DetalleIteracion d WHERE d.numeroIteracion = :numeroIteracion"),
    @NamedQuery(name = "DetalleIteracion.findByFechaInicioIteracion", query = "SELECT d FROM DetalleIteracion d WHERE d.fechaInicioIteracion = :fechaInicioIteracion"),
    @NamedQuery(name = "DetalleIteracion.findByFechaFinIteracion", query = "SELECT d FROM DetalleIteracion d WHERE d.fechaFinIteracion = :fechaFinIteracion")})
public class DetalleIteracion implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleIteracionId")
    private List<IteracionAmbientes> iteracionAmbientesList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "codigo_iteracion")
    private String codigoIteracion;
    @Basic(optional = false)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Basic(optional = false)
    @Column(name = "letra_numero_iteracion")
    private String letraNumeroIteracion;
    @Basic(optional = false)
    @Column(name = "numero_iteracion")
    private int numeroIteracion;
    @Column(name = "fecha_inicio_iteracion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioIteracion;
    @Column(name = "fecha_fin_iteracion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinIteracion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleIteracionId")
    private Collection<ProjectCharter> projectCharterCollection;

    public DetalleIteracion() {
    }

    public DetalleIteracion(Long id) {
        this.id = id;
    }

    public DetalleIteracion(Long id, String codigoIteracion, String nombreCliente, String letraNumeroIteracion, int numeroIteracion) {
        this.id = id;
        this.codigoIteracion = codigoIteracion;
        this.nombreCliente = nombreCliente;
        this.letraNumeroIteracion = letraNumeroIteracion;
        this.numeroIteracion = numeroIteracion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoIteracion() {
        return codigoIteracion;
    }

    public void setCodigoIteracion(String codigoIteracion) {
        this.codigoIteracion = codigoIteracion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getLetraNumeroIteracion() {
        return letraNumeroIteracion;
    }

    public void setLetraNumeroIteracion(String letraNumeroIteracion) {
        this.letraNumeroIteracion = letraNumeroIteracion;
    }

    public int getNumeroIteracion() {
        return numeroIteracion;
    }

    public void setNumeroIteracion(int numeroIteracion) {
        this.numeroIteracion = numeroIteracion;
    }

    public Date getFechaInicioIteracion() {
        return fechaInicioIteracion;
    }

    public void setFechaInicioIteracion(Date fechaInicioIteracion) {
        this.fechaInicioIteracion = fechaInicioIteracion;
    }

    public Date getFechaFinIteracion() {
        return fechaFinIteracion;
    }

    public void setFechaFinIteracion(Date fechaFinIteracion) {
        this.fechaFinIteracion = fechaFinIteracion;
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
        if (!(object instanceof DetalleIteracion)) {
            return false;
        }
        DetalleIteracion other = (DetalleIteracion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.DetalleIteracion[ id=" + id + " ]";
    }

    @XmlTransient
    @JsonIgnore
    public List<IteracionAmbientes> getIteracionAmbientesList() {
        return iteracionAmbientesList;
    }

    public void setIteracionAmbientesList(List<IteracionAmbientes> iteracionAmbientesList) {
        this.iteracionAmbientesList = iteracionAmbientesList;
    }
    
}
