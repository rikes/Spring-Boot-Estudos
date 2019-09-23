package pdcase.com.br.domain.pk;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ServicoPK implements Serializable{
	 
	private static final long serialVersionUID = 1L;

	@Column(name= "CD_SERVICO")
	private Long codigoServico;
	
	@Column(name = "ID_ESTAB")
	private BigInteger idEstab;

	public Long getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(Long codigoServico) {
		this.codigoServico = codigoServico;
	}

	public BigInteger getIdEstab() {
		return idEstab;
	}

	public void setIdEstab(BigInteger idEstab) {
		this.idEstab = idEstab;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoServico == null) ? 0 : codigoServico.hashCode());
		result = prime * result + ((idEstab == null) ? 0 : idEstab.hashCode());
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
		ServicoPK other = (ServicoPK) obj;
		if (codigoServico == null) {
			if (other.codigoServico != null)
				return false;
		} else if (!codigoServico.equals(other.codigoServico))
			return false;
		if (idEstab == null) {
			if (other.idEstab != null)
				return false;
		} else if (!idEstab.equals(other.idEstab))
			return false;
		return true;
	}

	public ServicoPK(Long codigoServico, BigInteger idEstab) {
		super();
		this.codigoServico = codigoServico;
		this.idEstab = idEstab;
	}
	
	
	
	
	
}
