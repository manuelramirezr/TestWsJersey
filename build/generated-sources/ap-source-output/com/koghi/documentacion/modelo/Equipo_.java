package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.ProjectCharter;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, Long> id;
    public static volatile SingularAttribute<Equipo, String> nombreEquipo;
    public static volatile CollectionAttribute<Equipo, ProjectCharter> projectCharterCollection;
    public static volatile SingularAttribute<Equipo, Integer> velocityMaximo;
    public static volatile SingularAttribute<Equipo, Integer> cantidadIntegrantes;
    public static volatile SingularAttribute<Equipo, Integer> velocityActual;

}