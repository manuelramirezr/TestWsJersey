package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.Sponsor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(DetalleSponsor.class)
public class DetalleSponsor_ { 

    public static volatile SingularAttribute<DetalleSponsor, Long> id;
    public static volatile SingularAttribute<DetalleSponsor, String> cargoFirma;
    public static volatile SingularAttribute<DetalleSponsor, String> nombreFirma;
    public static volatile SingularAttribute<DetalleSponsor, Sponsor> sponsorId;

}