package br.com.PharmaceuticsSystem.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.PharmaceuticsSystem.domain.Fornecedor;

public class FornecedorDAOTest {
	@Test
	//@Ignore
	public void salvar(){
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Seridó Cosméticos");
		fornecedor.setTelefone("3417-2910");
		
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		fornecedorDAO.salvar(fornecedor);
	}
	
	@Test
	//@Ignore
	public void listar() {
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		List<Fornecedor> resultado = fornecedorDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Fornecedor fornecedor : resultado) {
			System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getNome() + " - " + fornecedor.getTelefone());
		}
	}
	
	@Test
	//@Ignore
	public void buscar(){
		Long codigo = 1L;
		
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(codigo);
		
		if(fornecedor == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getNome() + " - " + fornecedor.getTelefone());
		}
	}
	
	@Test
	//@Ignore
	public void excluir(){
		Long codigo = 2L;
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(codigo);
		
		if(fornecedor == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			fornecedorDAO.excluir(fornecedor);
			System.out.println("Registro removido:");
			System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getNome() + " - " + fornecedor.getTelefone());
		}
	}
	
	@Test
	//@Ignore
	public void editar(){
		Long codigo = 1L;
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(codigo);
		
		if(fornecedor == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro editado - Antes:");
			System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getNome() + " - " + fornecedor.getTelefone());
			
			fornecedor.setNome("Fornecedor Teste");
			fornecedor.setTelefone("3120-3120");
			fornecedorDAO.editar(fornecedor);
			
			System.out.println("Registro editado - Depois:");
			System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getNome() + " - " + fornecedor.getTelefone());
		}
	}
}

