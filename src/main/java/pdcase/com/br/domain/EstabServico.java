package pdcase.com.br.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import pdcase.com.br.domain.pk.EstabServicoPK;

@Entity
@Table(name="Estabelecimento_Servico")
@IdClass(EstabServicoPK.class)
public class EstabServico implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	
	@Column(name="DT_CAT_SERV")
	private String dtServico;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_ESTAB", referencedColumnName = "ID_ESTAB", nullable = true, insertable=false, updatable=false)	
	private Estabelecimento estabelecimento;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "CD_SERVICO", referencedColumnName = "CD_SERVICO", nullable = true, insertable=false, updatable=false)	
	private Servico servico;


//	public EstabServicoPK getPk() {
//		return pk;
//	}
//
//
//	public void setPk(EstabServicoPK pk) {
//		this.pk = pk;
//	}


	public String getDtServico() {
		return dtServico;
	}


	public void setDtServico(String dtServico) {
		this.dtServico = dtServico;
	}


	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}


	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}


	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}


	public EstabServico(EstabServicoPK pk, String dtServico, Estabelecimento estabelecimento, Servico servico) {
		super();
		//this.pk = pk;
		this.dtServico = dtServico;
		this.estabelecimento = estabelecimento;
		this.servico = servico;
	}



	
	
}
