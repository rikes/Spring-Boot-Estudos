package pdcase.com.br.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estabelecimento")
public class Estabelecimento implements Serializable{
	 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTAB")
	private BigInteger idEstab;
	
	@Column(name="NR_ESTAB")
	private String numero;

	public BigInteger getIdEstab() {
		return idEstab;
	}

	public void setIdEstab(BigInteger idEstab) {
		this.idEstab = idEstab;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Estabelecimento(BigInteger idEstab, String numero) {
		super();
		this.idEstab = idEstab;
		this.numero = numero;
	}

	public Estabelecimento() {
		super();
	}
	
	
	
	
}
