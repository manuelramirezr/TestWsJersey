package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.Ambiente;
import com.koghi.documentacion.modelo.DetalleIteracion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(IteracionAmbientes.class)
public class IteracionAmbientes_ { 

    public static volatile SingularAttribute<IteracionAmbientes, String> rutaSwitch;
    public static volatile SingularAttribute<IteracionAmbientes, Ambiente> ambienteId;
    public static volatile SingularAttribute<IteracionAmbientes, Long> iteracionambiente;
    public static volatile SingularAttribute<IteracionAmbientes, String> nombreHost;
    public static volatile SingularAttribute<IteracionAmbientes, String> identificacionSwitch;
    public static volatile SingularAttribute<IteracionAmbientes, DetalleIteracion> detalleIteracionId;
    public static volatile SingularAttribute<IteracionAmbientes, String> ip;

}