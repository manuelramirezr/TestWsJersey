package com.koghi.documentacion.modelo;

import com.koghi.documentacion.modelo.IteracionAmbientes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-12T14:24:29")
@StaticMetamodel(Ambiente.class)
public class Ambiente_ { 

    public static volatile SingularAttribute<Ambiente, Long> id;
    public static volatile ListAttribute<Ambiente, IteracionAmbientes> iteracionAmbientesList;
    public static volatile SingularAttribute<Ambiente, String> descripcionAmbiente;

}