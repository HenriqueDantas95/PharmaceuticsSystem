package br.com.PharmaceuticsSystem.util;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    public static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();

    public static SessionFactory getFabricaDeSessoes() {
    		return fabricaDeSessoes;
    }
    private static SessionFactory criarFabricaDeSessoes() {
        try {
            // Cria uma conexao a partir do hibernate.cfg.xml
           
        	Configuration configuracao = new Configuration().configure();
      
        	
        	ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
        	
        	
        	SessionFactory fabrica = configuracao.buildSessionFactory(registro);
        	
        	return fabrica;
        	
        	
        	//return new Configuration().configure().buildSessionFactory(
			  //  new StandardServiceRegistryBuilder().build() );
        }
        catch (Throwable ex) {
            // Mensagem de erro ao conectar
            System.err.println("A fábrica de sessões não pode ser criada" + ex);
            throw new ExceptionInInitializerError(ex);
        }
        
    }

}