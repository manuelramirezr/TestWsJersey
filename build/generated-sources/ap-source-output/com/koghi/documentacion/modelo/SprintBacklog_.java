package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.ProjectCharter;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(SprintBacklog.class)
public class SprintBacklog_ { 

    public static volatile SingularAttribute<SprintBacklog, Long> id;
    public static volatile SingularAttribute<SprintBacklog, Integer> puntos;
    public static volatile SingularAttribute<SprintBacklog, String> alcance;
    public static volatile SingularAttribute<SprintBacklog, String> especificacion;
    public static volatile CollectionAttribute<SprintBacklog, ProjectCharter> projectCharterCollection;
    public static volatile SingularAttribute<SprintBacklog, String> descripcion;
    public static volatile SingularAttribute<SprintBacklog, String> idHistoria;
    public static volatile SingularAttribute<SprintBacklog, Integer> incertidumbre;

}