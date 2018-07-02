package br.com.PharmaceuticsSystem.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.PharmaceuticsSystem.domain.Pessoa;
import br.com.PharmaceuticsSystem.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	//@Ignore
	public void salvar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);
		
		System.out.println("Pessoa Encontrada");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('A');
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		System.out.println("Usuário salvo com sucesso.");
	}
	
	@Test
	//@Ignore
	public void listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();
		
		System.out.println("Total de Registros Encontrados: " + resultado.size());
		
		for (Usuario usuario : resultado) {
			System.out.println(usuario.getCodigo() + " - " + usuario.getAtivoFormatado() + " - " + usuario.getSenha() + " - " + usuario.getTipoFormatado() + " - " + usuario.getPessoa());
		}
	}
	
	@Test
	//@Ignore
	public void buscar(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(new Long("1"));
		
		if(usuario == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(usuario.getCodigo() + " - " + usuario.getAtivoFormatado() + " - " + usuario.getSenha() + " - " + usuario.getTipoFormatado() + " - " + usuario.getPessoa());
		}
	}
	
	@Test
	//@Ignore
	public void editar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(new Long("1"));
		
		if(usuario == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			usuario.setSenha("1234");
			usuarioDAO.editar(usuario);
			System.out.println("Registro alterado.");
		}
	}
	
	@Test
	//@Ignore
	public void excluir() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(new Long("1"));
		
		if(usuario == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			usuarioDAO.excluir(usuario);
			System.out.println("Registro excluido.");
		}
	}
}
