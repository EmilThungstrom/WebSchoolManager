package com.lexicon.emil.WebSchoolManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupSetup {
	
	static public SessionFactory sessionFactory;
	
	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("initializing SessionFactory...");
		sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	}
}
