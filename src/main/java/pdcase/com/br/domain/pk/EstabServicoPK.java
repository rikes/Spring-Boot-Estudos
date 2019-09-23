package pdcase.com.br.domain.pk;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class EstabServicoPK implements Serializable{
	 
	private static final long serialVersionUID = 1L;

	private Long servico;
	
	private BigInteger estabelecimento;

	public Long getServico() {
		return servico;
	}

	public void setServico(Long servico) {
		this.servico = servico;
	}

	public BigInteger getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(BigInteger estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public EstabServicoPK(Long servico, BigInteger estabelecimento) {
		super();
		this.servico = servico;
		this.estabelecimento = estabelecimento;
	}
	
	
	
	
}
