package com.koghi.documentacion.util;

import com.koghi.documentacion.modelo.Ambiente;
import com.koghi.documentacion.modelo.DetalleIteracion;
import com.koghi.documentacion.modelo.DetalleSponsor;
import com.koghi.documentacion.modelo.Equipo;
import com.koghi.documentacion.modelo.Hito;
import com.koghi.documentacion.modelo.IteracionAmbientes;
import com.koghi.documentacion.modelo.ProjectCharter;
import com.koghi.documentacion.modelo.Sponsor;
import com.koghi.documentacion.modelo.SprintBacklog;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({Ambiente.class, DetalleSponsor.class, DetalleIteracion.class, Equipo.class,
            Hito.class, IteracionAmbientes.class, ProjectCharter.class, Sponsor.class, SprintBacklog.class})
public class Respuesta<Data> {
	
	private List<Data> data = new ArrayList<Data>();
	
	private boolean success = true;
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	private String message;
	
	private int totalCount;

	public boolean isSuccess() {
		return success;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
		
}
