package com.app.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VMonitor")
public class VMonitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8117208877570601908L;
	
	@Id
	@Column(name = "OrdenID")
	private Long OrdenId;
	
	@Column(name = "OrdenFECHA")
	private LocalDate OrdenFch;
		
	@Column(name = "OrdenOBS")
	private String OrdenObs;
	
	@Column(name = "OrdenNPEDIDO")
	private String OrdenNPedido;
	
	@Column(name = "OrdenESTADO")
	private String OrdenEstado;
	
	@Column(name = "IdPICKEO")
	private Long IdPickeo;
	
	@Column(name = "NRORomaneo")
	private String NroRomaneo;
	
	@Column(name = "FechaROMANEO")
	private LocalDateTime FchRomaneo;
	
	@Column(name = "NroREMITO")
	private String NroRemito;
	
	@Column(name = "FechaREMITO")
	private LocalDateTime FchRemito;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getOrdenId() {
		return OrdenId;
	}

	public LocalDate getOrdenFch() {
		return OrdenFch;
	}

	public String getOrdenObs() {
		return OrdenObs;
	}

	public String getOrdenNPedido() {
		return OrdenNPedido;
	}

	public String getOrdenEstado() {
		return OrdenEstado;
	}

	public Long getIdPickeo() {
		return IdPickeo;
	}

	public String getNroRomaneo() {
		return NroRomaneo;
	}

	public LocalDateTime getFchRomaneo() {
		return FchRomaneo;
	}

	public String getNroRemito() {
		return NroRemito;
	}

	public LocalDateTime getFchRemito() {
		return FchRemito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FchRemito == null) ? 0 : FchRemito.hashCode());
		result = prime * result + ((FchRomaneo == null) ? 0 : FchRomaneo.hashCode());
		result = prime * result + ((IdPickeo == null) ? 0 : IdPickeo.hashCode());
		result = prime * result + ((NroRemito == null) ? 0 : NroRemito.hashCode());
		result = prime * result + ((NroRomaneo == null) ? 0 : NroRomaneo.hashCode());
		result = prime * result + ((OrdenEstado == null) ? 0 : OrdenEstado.hashCode());
		result = prime * result + ((OrdenFch == null) ? 0 : OrdenFch.hashCode());
		result = prime * result + ((OrdenId == null) ? 0 : OrdenId.hashCode());
		result = prime * result + ((OrdenNPedido == null) ? 0 : OrdenNPedido.hashCode());
		result = prime * result + ((OrdenObs == null) ? 0 : OrdenObs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VMonitor other = (VMonitor) obj;
		if (FchRemito == null) {
			if (other.FchRemito != null)
				return false;
		} else if (!FchRemito.equals(other.FchRemito))
			return false;
		if (FchRomaneo == null) {
			if (other.FchRomaneo != null)
				return false;
		} else if (!FchRomaneo.equals(other.FchRomaneo))
			return false;
		if (IdPickeo == null) {
			if (other.IdPickeo != null)
				return false;
		} else if (!IdPickeo.equals(other.IdPickeo))
			return false;
		if (NroRemito == null) {
			if (other.NroRemito != null)
				return false;
		} else if (!NroRemito.equals(other.NroRemito))
			return false;
		if (NroRomaneo == null) {
			if (other.NroRomaneo != null)
				return false;
		} else if (!NroRomaneo.equals(other.NroRomaneo))
			return false;
		if (OrdenEstado == null) {
			if (other.OrdenEstado != null)
				return false;
		} else if (!OrdenEstado.equals(other.OrdenEstado))
			return false;
		if (OrdenFch == null) {
			if (other.OrdenFch != null)
				return false;
		} else if (!OrdenFch.equals(other.OrdenFch))
			return false;
		if (OrdenId == null) {
			if (other.OrdenId != null)
				return false;
		} else if (!OrdenId.equals(other.OrdenId))
			return false;
		if (OrdenNPedido == null) {
			if (other.OrdenNPedido != null)
				return false;
		} else if (!OrdenNPedido.equals(other.OrdenNPedido))
			return false;
		if (OrdenObs == null) {
			if (other.OrdenObs != null)
				return false;
		} else if (!OrdenObs.equals(other.OrdenObs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VMonitor [OrdenId=" + OrdenId + ", OrdenFch=" + OrdenFch + ", OrdenObs=" + OrdenObs + ", OrdenNPedido="
				+ OrdenNPedido + ", OrdenEstado=" + OrdenEstado + ", IdPickeo=" + IdPickeo + ", NroRomaneo="
				+ NroRomaneo + ", FchRomaneo=" + FchRomaneo + ", NroRemito=" + NroRemito + ", FchRemito=" + FchRemito
				+ "]";
	}

	public VMonitor(Long ordenId, LocalDate ordenFch, String ordenObs, String ordenNPedido, String ordenEstado,
			Long idPickeo, String nroRomaneo, LocalDateTime fchRomaneo, String nroRemito, LocalDateTime fchRemito) {
		super();
		OrdenId = ordenId;
		OrdenFch = ordenFch;
		OrdenObs = ordenObs;
		OrdenNPedido = ordenNPedido;
		OrdenEstado = ordenEstado;
		IdPickeo = idPickeo;
		NroRomaneo = nroRomaneo;
		FchRomaneo = fchRomaneo;
		NroRemito = nroRemito;
		FchRemito = fchRemito;
	}

	public VMonitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

		
	
	

	
	

}
