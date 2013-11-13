package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.IteracionAmbientes;
import com.koghi.documentacion.modelo.ProjectCharter;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(DetalleIteracion.class)
public class DetalleIteracion_ { 

    public static volatile SingularAttribute<DetalleIteracion, Long> id;
    public static volatile SingularAttribute<DetalleIteracion, Date> fechaFinIteracion;
    public static volatile SingularAttribute<DetalleIteracion, String> letraNumeroIteracion;
    public static volatile CollectionAttribute<DetalleIteracion, ProjectCharter> projectCharterCollection;
    public static volatile ListAttribute<DetalleIteracion, IteracionAmbientes> iteracionAmbientesList;
    public static volatile SingularAttribute<DetalleIteracion, Date> fechaInicioIteracion;
    public static volatile SingularAttribute<DetalleIteracion, String> codigoIteracion;
    public static volatile SingularAttribute<DetalleIteracion, String> nombreCliente;
    public static volatile SingularAttribute<DetalleIteracion, Integer> numeroIteracion;

}