package com.unlp.jyaa.di.service;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.glassfish.hk2.api.PerLookup;
import org.jvnet.hk2.annotations.Service;

/**
 * 
 * @author Andrés Vazzano (andres.vazzano@gmail.com)
 *
 */
@Service
@PerLookup
public class ServiceAImpl implements ServiceA {
	
	@Inject
	private ServiceB serviceB;
		
	@Inject
	@Named("ServiceB2Impl")
	private ServiceB serviceB2;
	
	
	@Inject
	private ServiceC singletonA;
	
	@Inject
	private ServiceC singletonB;
	
	@Inject
	private ServiceD perLookupA;
	
//	@Inject
	private ServiceD perLookupB;

	@Inject
	private ServiceE perThreadA;
	
//	@Inject
	private ServiceE perThreadB;
	
	
	@Inject
	public ServiceAImpl(ServiceE perThreadB, ServiceD perLookupB) {
		this.perThreadB=perThreadB;
		this.perLookupB=perLookupB;
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Instancia A creada.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Instancia A elimianda.");
	}
	
	public void saludar() {
		System.out.println("Soy A");
		serviceB.saludar();
		serviceB2.saludar();
		
	}
	
	
	public void testScopes() {
		
		System.out.println("Compara Singletons " + (singletonA == singletonB) );
		
		System.out.println("Compara PerLookUP " + (perLookupA == perLookupB));
		
		System.out.println("Compara PerThread " + (perThreadA == perThreadB));
		

	}
	
	

}
