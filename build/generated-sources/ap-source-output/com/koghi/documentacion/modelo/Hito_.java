package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.ProjectCharter;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(Hito.class)
public class Hito_ { 

    public static volatile SingularAttribute<Hito, Long> id;
    public static volatile CollectionAttribute<Hito, ProjectCharter> projectCharterCollection;
    public static volatile SingularAttribute<Hito, Date> fechaProgramadaHito;
    public static volatile SingularAttribute<Hito, String> descripcion;

}