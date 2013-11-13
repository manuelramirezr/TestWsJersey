package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.DetalleSponsor;
import com.koghi.documentacion.modelo.ProjectCharter;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(Sponsor.class)
public class Sponsor_ { 

    public static volatile SingularAttribute<Sponsor, Long> id;
    public static volatile CollectionAttribute<Sponsor, DetalleSponsor> detalleSponsorCollection;
    public static volatile CollectionAttribute<Sponsor, ProjectCharter> projectCharterCollection;
    public static volatile SingularAttribute<Sponsor, String> rolProyecto;
    public static volatile SingularAttribute<Sponsor, String> nombreSponsor;

}