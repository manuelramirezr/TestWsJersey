/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo;


import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author mramirez
 */
@Entity
@Table(name = "ambiente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ambiente.findAll", query = "SELECT a FROM Ambiente a"),
    @NamedQuery(name = "Ambiente.findById", query = "SELECT a FROM Ambiente a WHERE a.id = :id"),
    @NamedQuery(name = "Ambiente.findByDescripcionAmbiente", query = "SELECT a FROM Ambiente a WHERE a.descripcionAmbiente = :descripcionAmbiente")})
public class Ambiente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = true)
    private Long id;
    @Basic(optional = false)
    @Column(name = "descripcion_ambiente", nullable = false)
    @NotNull
    private String descripcionAmbiente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ambienteId")
    private List<IteracionAmbientes> iteracionAmbientesList;

    public Ambiente() {
    }

    public Ambiente(Long id) {
        this.id = id;
    }

    public Ambiente(String descripcionAmbiente) {
        this.descripcionAmbiente = descripcionAmbiente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcionAmbiente() {
        return descripcionAmbiente;
    }

    public void setDescripcionAmbiente(String descripcionAmbiente) {
        this.descripcionAmbiente = descripcionAmbiente;
    }

    @XmlTransient
    @JsonIgnore
    public List<IteracionAmbientes> getIteracionAmbientesList() {
        return iteracionAmbientesList;
    }

    public void setIteracionAmbientesList(List<IteracionAmbientes> iteracionAmbientesList) {
        this.iteracionAmbientesList = iteracionAmbientesList;
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
        if (!(object instanceof Ambiente)) {
            return false;
        }
        Ambiente other = (Ambiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.Ambiente[ id=" + id + " ]";
    }
    
}
