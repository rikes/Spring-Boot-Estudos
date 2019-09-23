package pdcase.com.br.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pdcase.com.br.domain.Categoria;
import pdcase.com.br.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired// alternativa para @Inject
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);		
		//return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado ID"+ id));// OrElse para poder retornar null caso não for encontrado
		return null;
	}
	
	public void insert(Categoria pCategoria) {
		repo.save(pCategoria);
	}
	

}
