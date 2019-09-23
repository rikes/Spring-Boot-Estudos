package pdcase.com.br;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pdcase.com.br.domain.Categoria;
import pdcase.com.br.domain.Produto;
import pdcase.com.br.repository.CategoriaRepository;
import pdcase.com.br.repository.ProdutoRepository;

@SpringBootApplication
public class AppSpringBootApplication  implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
//	@Autowired
//	private EstabServRepository estabServRepository;
//	
//	@Autowired
//	private EstabRepository estabRepository ;
//	
//	@Autowired
//	private ServRepository servicoRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(AppSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {//
		Categoria cat1 = new Categoria(null, "Informática");//null pq o bd que vai criar o id
		Categoria cat2 = new Categoria(null, "Escritório"); 
		
		
		Produto p1 = new Produto (null, "Computador", 3000.00);
		Produto p2 = new Produto (null, "Impressora", 400.00);
		Produto p3 = new Produto (null, "Mouse", 70.00);
		Produto p4 = new Produto (null, "Teclado", 100.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.setProdutos(Arrays.asList(p1,p3,p4));
		
		p1.setCategorias(Arrays.asList(cat1));
		p2.setCategorias(Arrays.asList(cat2));
		p3.setCategorias(Arrays.asList(cat1, cat2));
		p4.setCategorias(Arrays.asList(cat2,cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		//TESTEs 
//		Estabelecimento es1 = new Estabelecimento(null, "42");
//		Estabelecimento es2 = new Estabelecimento(null, "4");
//		Estabelecimento es3 = new Estabelecimento(null, "2");
//		Estabelecimento es4 = new Estabelecimento(null, "182");
//		Estabelecimento es5 = new Estabelecimento(null, "000000");
//		
//		this.estabRepository.saveAll(Arrays.asList(es1,es2,es3, es4, es5));
		
//		Servico s1 = new Servico(11L, "Servico Teste 1", Arrays.asList(es1,es2,es3), null);
//		
//		EstabServicoPK pk = new EstabServicoPK(s1.getCodServico(), es1.getIdEstab());
//		//EstabServico estabServ1 = new EstabServico(pk, "03071990", Arrays.asList(es1,es2));
//		EstabServico estabServ1 = new EstabServico(pk, "03071990", null);
//		
//			
//		Servico s2 = new Servico(null, "Servico Final Teste", Arrays.asList(es4,es5), estabServ1);
		
		//this.estabRepository.saveAll(Arrays.asList(es1,es2,es3, es4, es5));
//		this.servicoRepository.saveAll(Arrays.asList(s1,s2));
//		this.estabServRepository.saveAll(Arrays.asList(estabServ1));
		
		
		
		
		
	}

}
