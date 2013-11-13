/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koghi.documentacion.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mramirez
 */
@Entity
@Table(name = "project_charter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjectCharter.findAll", query = "SELECT p FROM ProjectCharter p"),
    @NamedQuery(name = "ProjectCharter.findById", query = "SELECT p FROM ProjectCharter p WHERE p.id = :id"),
    @NamedQuery(name = "ProjectCharter.findByFechaSpringMeeting", query = "SELECT p FROM ProjectCharter p WHERE p.fechaSpringMeeting = :fechaSpringMeeting"),
    @NamedQuery(name = "ProjectCharter.findByProjectManager", query = "SELECT p FROM ProjectCharter p WHERE p.projectManager = :projectManager"),
    @NamedQuery(name = "ProjectCharter.findByNumeroActa", query = "SELECT p FROM ProjectCharter p WHERE p.numeroActa = :numeroActa"),
    @NamedQuery(name = "ProjectCharter.findByLugarSprintMeeting", query = "SELECT p FROM ProjectCharter p WHERE p.lugarSprintMeeting = :lugarSprintMeeting"),
    @NamedQuery(name = "ProjectCharter.findByElaboradoPor", query = "SELECT p FROM ProjectCharter p WHERE p.elaboradoPor = :elaboradoPor"),
    @NamedQuery(name = "ProjectCharter.findByAprobadoPor", query = "SELECT p FROM ProjectCharter p WHERE p.aprobadoPor = :aprobadoPor"),
    @NamedQuery(name = "ProjectCharter.findByVelocityEquipoIteracion", query = "SELECT p FROM ProjectCharter p WHERE p.velocityEquipoIteracion = :velocityEquipoIteracion"),
    @NamedQuery(name = "ProjectCharter.findBySemanasSprint", query = "SELECT p FROM ProjectCharter p WHERE p.semanasSprint = :semanasSprint"),
    @NamedQuery(name = "ProjectCharter.findByProductOwner", query = "SELECT p FROM ProjectCharter p WHERE p.productOwner = :productOwner"),
    @NamedQuery(name = "ProjectCharter.findByReportaA", query = "SELECT p FROM ProjectCharter p WHERE p.reportaA = :reportaA")})
public class ProjectCharter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha_spring_meeting")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSpringMeeting;
    @Basic(optional = false)
    @Column(name = "project_manager")
    private String projectManager;
    @Basic(optional = false)
    @Column(name = "numero_acta")
    private int numeroActa;
    @Basic(optional = false)
    @Column(name = "lugar_sprint_meeting")
    private String lugarSprintMeeting;
    @Basic(optional = false)
    @Column(name = "elaborado_por")
    private String elaboradoPor;
    @Basic(optional = false)
    @Column(name = "aprobado_por")
    private String aprobadoPor;
    @Basic(optional = false)
    @Column(name = "velocity_equipo_iteracion")
    private int velocityEquipoIteracion;
    @Basic(optional = false)
    @Column(name = "semanas_sprint")
    private int semanasSprint;
    @Basic(optional = false)
    @Lob
    @Column(name = "comentarios_sprint_meeting")
    private String comentariosSprintMeeting;
    @Basic(optional = false)
    @Column(name = "product_owner")
    private String productOwner;
    @Basic(optional = false)
    @Column(name = "reporta_a")
    private String reportaA;
    @JoinColumn(name = "sponsor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sponsor sponsorId;
    @JoinColumn(name = "hito_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Hito hitoId;
    @JoinColumn(name = "sprint_backlog_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SprintBacklog sprintBacklogId;
    @JoinColumn(name = "detalle_iteracion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DetalleIteracion detalleIteracionId;
    @JoinColumn(name = "equipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Equipo equipoId;

    public ProjectCharter() {
    }

    public ProjectCharter(Integer id) {
        this.id = id;
    }

    public ProjectCharter(Integer id, Date fechaSpringMeeting, String projectManager, int numeroActa, String lugarSprintMeeting, String elaboradoPor, String aprobadoPor, int velocityEquipoIteracion, int semanasSprint, String comentariosSprintMeeting, String productOwner, String reportaA) {
        this.id = id;
        this.fechaSpringMeeting = fechaSpringMeeting;
        this.projectManager = projectManager;
        this.numeroActa = numeroActa;
        this.lugarSprintMeeting = lugarSprintMeeting;
        this.elaboradoPor = elaboradoPor;
        this.aprobadoPor = aprobadoPor;
        this.velocityEquipoIteracion = velocityEquipoIteracion;
        this.semanasSprint = semanasSprint;
        this.comentariosSprintMeeting = comentariosSprintMeeting;
        this.productOwner = productOwner;
        this.reportaA = reportaA;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaSpringMeeting() {
        return fechaSpringMeeting;
    }

    public void setFechaSpringMeeting(Date fechaSpringMeeting) {
        this.fechaSpringMeeting = fechaSpringMeeting;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public int getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(int numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getLugarSprintMeeting() {
        return lugarSprintMeeting;
    }

    public void setLugarSprintMeeting(String lugarSprintMeeting) {
        this.lugarSprintMeeting = lugarSprintMeeting;
    }

    public String getElaboradoPor() {
        return elaboradoPor;
    }

    public void setElaboradoPor(String elaboradoPor) {
        this.elaboradoPor = elaboradoPor;
    }

    public String getAprobadoPor() {
        return aprobadoPor;
    }

    public void setAprobadoPor(String aprobadoPor) {
        this.aprobadoPor = aprobadoPor;
    }

    public int getVelocityEquipoIteracion() {
        return velocityEquipoIteracion;
    }

    public void setVelocityEquipoIteracion(int velocityEquipoIteracion) {
        this.velocityEquipoIteracion = velocityEquipoIteracion;
    }

    public int getSemanasSprint() {
        return semanasSprint;
    }

    public void setSemanasSprint(int semanasSprint) {
        this.semanasSprint = semanasSprint;
    }

    public String getComentariosSprintMeeting() {
        return comentariosSprintMeeting;
    }

    public void setComentariosSprintMeeting(String comentariosSprintMeeting) {
        this.comentariosSprintMeeting = comentariosSprintMeeting;
    }

    public String getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(String productOwner) {
        this.productOwner = productOwner;
    }

    public String getReportaA() {
        return reportaA;
    }

    public void setReportaA(String reportaA) {
        this.reportaA = reportaA;
    }

    public Sponsor getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Sponsor sponsorId) {
        this.sponsorId = sponsorId;
    }

    public Hito getHitoId() {
        return hitoId;
    }

    public void setHitoId(Hito hitoId) {
        this.hitoId = hitoId;
    }

    public SprintBacklog getSprintBacklogId() {
        return sprintBacklogId;
    }

    public void setSprintBacklogId(SprintBacklog sprintBacklogId) {
        this.sprintBacklogId = sprintBacklogId;
    }

    public DetalleIteracion getDetalleIteracionId() {
        return detalleIteracionId;
    }

    public void setDetalleIteracionId(DetalleIteracion detalleIteracionId) {
        this.detalleIteracionId = detalleIteracionId;
    }

    public Equipo getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Equipo equipoId) {
        this.equipoId = equipoId;
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
        if (!(object instanceof ProjectCharter)) {
            return false;
        }
        ProjectCharter other = (ProjectCharter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.koghi.documentacion.modelo.ProjectCharter[ id=" + id + " ]";
    }
    
}
