package pdcase.com.br.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pdcase.com.br.domain.Categoria;
import pdcase.com.br.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias") //EndPoint
public class CategoriaResource {
	
	@GetMapping //Atalho para - @RequestMapping(method=RequestMethod.GET) //Obtencao de informacao
	public List<Categoria> listar() {
		
		Categoria cat1 =new Categoria(1, "Militar");
		Categoria cat2 = new Categoria(2, "Farmácia");		
		
		
		List<Categoria> listCategoria = new ArrayList<>();
		
		listCategoria.add(cat1);
		listCategoria.add(cat2);
		

		return listCategoria;
	}
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> find( @PathVariable Integer id ) {//Anotacao de busca
		
		Categoria obj = service.find(id);

		return ResponseEntity.ok().body(obj); //ResponseEntity tem informacoes Http alem do obj Categoria
		
	}
	
	
	
}
