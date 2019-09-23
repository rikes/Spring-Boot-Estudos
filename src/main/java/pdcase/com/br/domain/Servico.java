package pdcase.com.br.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Servico")
public class Servico implements Serializable{
	 
	private static final long serialVersionUID = 1L;

//	@EmbeddedId
//	private ServicoPK pk;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CD_SERVICO")
	private Long codServico;
	
	@Column(name="NAME_SERVICO")
	private String nome;
	
	//Entener melhor oq eu quero fazer para editar esses abaixo
//	@OneToMany(mappedBy = "idEstab")
//	private List<Estabelecimento> estabelecimentos;
	
	
//	@OneToMany()
//	private EstabServico estabServico;


	public Long getCodServico() {
		return codServico;
	}


	public void setCodServico(Long codServico) {
		this.codServico = codServico;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public Servico(Long codServico, String nome) {
		super();
		this.codServico = codServico;
		this.nome = nome;
	}
	
}
