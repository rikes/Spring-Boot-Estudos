package pdcase.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pdcase.com.br.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{//Integer eh o tipo do ID de Produto
	
}
