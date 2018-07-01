package br.com.PharmaceuticsSystem.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.PharmaceuticsSystem.domain.Cidade;
import br.com.PharmaceuticsSystem.domain.Pessoa;

public class PessoaDAOTest {
	@Test
	@Ignore
	public void salvar(){
		short v = 1;
		Pessoa pessoa = new Pessoa();
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(new Long("1"));
		
		pessoa.setNome("André Gurgel");
		pessoa.setCpf("091.012.534.17");
		pessoa.setRg("3.724.943");
		pessoa.setCelular("83 998176804");
		pessoa.setTelefone("3421-2181");
		pessoa.setEmail("andreggurgelufrn@gmail.com");
		pessoa.setCep("58300-000");
		pessoa.setCidade(cidade);
		pessoa.setBairro("Penedo");
		pessoa.setRua("Av. Coronel Martiniano");
		pessoa.setNumero(v);
		pessoa.setComplemento("Apto 205");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		System.out.println("Pessoa salvo com sucesso.");
	}
	
	@Test
	@Ignore
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		System.out.println("Total de Registros Encontrados: " + resultado.size());
		
		for (Pessoa pessoa : resultado) {
			System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome() + " - " + pessoa.getCpf() + " - " + pessoa.getRg() + " - " 
		+ pessoa.getCelular() + " - " + pessoa.getTelefone() + " - " + pessoa.getEmail() + " - " + pessoa.getCep() + " - " + pessoa.getCidade() + " - "
		+ pessoa.getBairro() + " - " + pessoa.getRua() + " - " + pessoa.getNumero() + " - " + pessoa.getComplemento());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(new Long("1"));
		
		if(pessoa == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome() + " - " + pessoa.getCpf() + " - " + pessoa.getRg() + " - " 
		+ pessoa.getCelular() + " - " + pessoa.getTelefone() + " - " + pessoa.getEmail() + " - " + pessoa.getCep() + " - " + pessoa.getCidade() + " - "
		+ pessoa.getBairro() + " - " + pessoa.getRua() + " - " + pessoa.getNumero() + " - " + pessoa.getComplemento());
		}
	}
	
	@Test
	@Ignore
	public void editar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(new Long(1));
		
		if(pessoa == null) {
			System.out.println("Nenhum registro encontrado.");
		}else {
			pessoa.setNome("André Gurgel");
			pessoaDAO.editar(pessoa);
			
			System.out.println("Registro alterado.");
		}
	}
	
	@Test
	@Ignore
	public void excluir() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(new Long(1));
		
		if(pessoa == null) {
			System.out.println("Nenhum registro encontrado.");
		}else {
			pessoaDAO.excluir(pessoa);
			
			System.out.println("Registro excluido.");
		}
	}
}