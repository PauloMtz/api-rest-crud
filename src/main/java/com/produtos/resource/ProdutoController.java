package com.produtos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.model.Produto;
import com.produtos.repository.ProdutoRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class ProdutoController {

	@Autowired
	ProdutoRepository repository;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos() {
		return repository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto buscaProduto(@PathVariable(value = "id") long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@DeleteMapping("/produto")
	public void excluirProduto(@RequestBody Produto produto) {
		repository.delete(produto);
	}
	
	@PutMapping("/produto")
	public Produto atualizarProduto(@RequestBody Produto produto) {
		return repository.save(produto);
	}
}
