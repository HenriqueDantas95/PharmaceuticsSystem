package br.com.PharmaceuticsSystem.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.PharmaceuticsSystem.domain.Administrador;

public class AdministradorDAOTest {
	@Test
	@Ignore
	public void salvar(){
		Administrador administrador = new Administrador();
		administrador.setNome("Henrique");
		administrador.setCpf("10310310314");
		administrador.setEndereco("Povoado Ermo");
		administrador.setTelefone("88694316");
		administrador.setEmail("henryhd@hotmail.com");
		
		AdministradorDAO administradorDAO = new AdministradorDAO();
		administradorDAO.salvar(administrador);

	}
	
	@Test
	@Ignore
	public void listar() {
		AdministradorDAO administradorDAO = new AdministradorDAO();
		List<Administrador> resultado = administradorDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Administrador administrador : resultado) {
			System.out.println(administrador.getCodigo() + " - " + administrador.getNome() + " - " + administrador.getCpf() + " - "
								+ administrador.getEndereco() + " - " + administrador.getTelefone()
								+ " - " + administrador.getEmail());
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 1L;
		
		AdministradorDAO administradorDAO = new AdministradorDAO();
		Administrador administrador = administradorDAO.buscar(codigo);
		
		if(administrador == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(administrador.getCodigo() + " - " + administrador.getNome() + " - " + administrador.getCpf() + " - "
					+ administrador.getEndereco() + " - " + administrador.getTelefone()
					+ " - " + administrador.getEmail());
		}
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 1L;
		AdministradorDAO administradorDAO = new AdministradorDAO();
		Administrador administrador = administradorDAO.buscar(codigo);
		
		if(administrador == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			administradorDAO.excluir(administrador);
			System.out.println("Registro removido:");
			System.out.println(administrador.getCodigo() + " - " + administrador.getNome() + " - " + administrador.getCpf() + " - "
					+ administrador.getEndereco() + " - " + administrador.getTelefone()
					+ " - " + administrador.getEmail());
		}
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigo = 2L;
		AdministradorDAO administradorDAO = new AdministradorDAO();
		Administrador administrador = administradorDAO.buscar(codigo);
		
		if(administrador == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro editado - Antes:");
			System.out.println(administrador.getCodigo() + " - " + administrador.getNome() + " - " + administrador.getCpf() + " - "
					+ administrador.getEndereco() + " - " + administrador.getTelefone()
					+ " - " + administrador.getEmail());
			
			administrador.setNome("Henrique Dantas");
			administrador.setCpf("10310310314");
			administrador.setEndereco("Povoado Ermo");
			administrador.setTelefone("88694316");
			administrador.setEmail("henryhd@hotmail.com");
			administradorDAO.editar(administrador);
			
			System.out.println("Registro editado - Depois:");
			System.out.println(administrador.getCodigo() + " - " + administrador.getNome() + " - " + administrador.getCpf() + " - "
					+ administrador.getEndereco() + " - " + administrador.getTelefone()
					+ " - " + administrador.getEmail());
		}
	}
	

}
