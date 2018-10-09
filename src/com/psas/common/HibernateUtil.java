package com.psas.common;

import java.net.URI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.psas.pojo.CatalogMaster;
import com.psas.pojo.InteractionMaster;
import com.psas.pojo.ProductMaster;



 
public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Configuration configuration;
	//public static final String schemaName = "public";
	static {
		try
    	{
            if (sessionFactory == null) {
            	
            //	URI dbUri = new URI(System.getenv("DATABASE_URL"));

            	
                // loads configuration and mappings
            	 configuration = new Configuration();
                 configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
         	    configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
         	    configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/pasa");
         	    configuration.setProperty("hibernate.connection.username", "postgres");
         	    configuration.setProperty("hibernate.connection.password", "admin");
         	    configuration.setProperty("hibernate.show_sql", "true");
         	    configuration.setProperty("hibernate.default_schema", "pasa");
         	    
         	   configuration.setProperty("hibernate.hbm2ddl.auto", "create");
         	    
         	   
         	    configuration.addAnnotatedClass(ProductMaster.class);
         	    configuration.addAnnotatedClass(InteractionMaster.class);
         	   configuration.addAnnotatedClass(CatalogMaster.class);
                ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                 
                // builds a session factory from the service registry
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
            }

    		
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}
    
	}
 
    public static SessionFactory getSessionFactory() {
    	  return sessionFactory;
    }
    
    public static Session getSession()
    {
    	session = HibernateUtil.getSessionFactory() != null 
    			? HibernateUtil.getSessionFactory().openSession() : null;
    			
		return session;
    }

	public static Configuration getConfiguration() {
		return configuration;
	} 

    
    


}