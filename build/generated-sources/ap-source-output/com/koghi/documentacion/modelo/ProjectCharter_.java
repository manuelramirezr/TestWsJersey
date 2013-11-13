package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.DetalleIteracion;
import com.koghi.documentacion.modelo.Equipo;
import com.koghi.documentacion.modelo.Hito;
import com.koghi.documentacion.modelo.Sponsor;
import com.koghi.documentacion.modelo.SprintBacklog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(ProjectCharter.class)
public class ProjectCharter_ { 

    public static volatile SingularAttribute<ProjectCharter, Integer> semanasSprint;
    public static volatile SingularAttribute<ProjectCharter, String> elaboradoPor;
    public static volatile SingularAttribute<ProjectCharter, Equipo> equipoId;
    public static volatile SingularAttribute<ProjectCharter, String> projectManager;
    public static volatile SingularAttribute<ProjectCharter, String> reportaA;
    public static volatile SingularAttribute<ProjectCharter, Integer> numeroActa;
    public static volatile SingularAttribute<ProjectCharter, SprintBacklog> sprintBacklogId;
    public static volatile SingularAttribute<ProjectCharter, DetalleIteracion> detalleIteracionId;
    public static volatile SingularAttribute<ProjectCharter, Integer> id;
    public static volatile SingularAttribute<ProjectCharter, String> lugarSprintMeeting;
    public static volatile SingularAttribute<ProjectCharter, String> productOwner;
    public static volatile SingularAttribute<ProjectCharter, String> aprobadoPor;
    public static volatile SingularAttribute<ProjectCharter, Sponsor> sponsorId;
    public static volatile SingularAttribute<ProjectCharter, Integer> velocityEquipoIteracion;
    public static volatile SingularAttribute<ProjectCharter, Date> fechaSpringMeeting;
    public static volatile SingularAttribute<ProjectCharter, Hito> hitoId;
    public static volatile SingularAttribute<ProjectCharter, String> comentariosSprintMeeting;

}