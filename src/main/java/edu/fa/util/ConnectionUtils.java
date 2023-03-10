package edu.fa.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Component;

@Component
public class ConnectionUtils {
//private static SessionFactory sessionFactory = null;
	
	public SessionFactory getSessionFactory() {
		//if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry registry = new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
		//}
		return sessionFactory;
	}
}
