package br.gov.pa.cosanpa.gopera.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@SequenceGenerator(name = "sequence_eeat_horas_cmb", sequenceName = "sequence_eeat_horas_cmb", schema="operacao", initialValue = 1, allocationSize = 1)
@Table(name="eeat_horas_cmb",schema="operacao")
public class EEATHorasCMB implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sequence_eeat_horas_cmb")
	@Column(name="eatc_id", unique=true, nullable=false, precision=3, scale=0)		
	private Integer codigo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="eath_id")
	private EEATHoras eeathoras;
	
	@Column(name="eatc_qtdcmb")
	private Integer quantidade;

	@Column(name="eatc_horacmb")
	private Double hora;

	@Transient
	private String horaAux;

	public EEATHorasCMB() {
		super();
		this.horaAux = "0,00";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public EEATHoras getEeathoras() {
		return eeathoras;
	}

	public void setEeathoras(EEATHoras eeathoras) {
		this.eeathoras = eeathoras;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getHora() {
		return hora;
	}

	public void setHora(Double hora) {
		this.hora = hora;
	}

	public String getHoraAux() {
		return horaAux;
	}

	public void setHoraAux(String horaAux) {
		this.horaAux = horaAux;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((eeathoras == null) ? 0 : eeathoras.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((horaAux == null) ? 0 : horaAux.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
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
		EEATHorasCMB other = (EEATHorasCMB) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (eeathoras == null) {
			if (other.eeathoras != null)
				return false;
		} else if (!eeathoras.equals(other.eeathoras))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (horaAux == null) {
			if (other.horaAux != null)
				return false;
		} else if (!horaAux.equals(other.horaAux))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

	public String toString() {
		return "EEATHorasCMB [codigo=" + codigo + ", quantidade=" + quantidade + ", hora=" + hora + "]";
	}
}
