package br.com.PharmaceuticsSystem.test;

import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

import br.com.PharmaceuticsSystem.util.HibernateUtil;

public class HibernateUtilTest {
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}

