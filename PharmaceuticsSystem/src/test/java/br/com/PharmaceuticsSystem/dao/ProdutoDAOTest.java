package br.com.PharmaceuticsSystem.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.PharmaceuticsSystem.domain.Fornecedor;
import br.com.PharmaceuticsSystem.domain.Produto;

public class ProdutoDAOTest {
	
	@Test
	@Ignore
	public void salvar(){
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(new Long("1"));
		
		Produto produto = new Produto();
		produto.setDescricao("Agulhas");
		produto.setFornecedor(fornecedor);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
	
	@Test
	@Ignore
	public void listar() {
		ProdutoDAO ProdutoDAO = new ProdutoDAO();
		List<Produto> resultado = ProdutoDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Produto produto : resultado) {
			System.out.println(produto.getCodigo() + " - " + produto.getDescricao() + " - " + produto.getQuantidade() + " - " + produto.getPreco() + " - " + produto.getFornecedor());
		}
	}
	
	@Test
	@Ignore
	public void editar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(new Long(1));
		
		if(produto == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			produto.setDescricao("Remedios");
			produto.setPreco(new BigDecimal("15.00"));
			produto.setQuantidade(new Short("10"));
			
			produtoDAO.editar(produto);
		} 
	}
	
	@Test
	@Ignore
	public void excluir() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(new Long(1));
		
		if(produto == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			produtoDAO.excluir(produto);
		}	
	}
	
}

