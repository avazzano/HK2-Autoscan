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
	private ServiceC c1Singleton;
	
	@Inject
	private ServiceC c2Singleton;
	
	@Inject
	@Named("ServiceC1Impl")
	private ServiceC c1PerLook;
	
	@Inject
	@Named("ServiceC1Impl")
	private ServiceC c2PerLook;
	
	
	@Inject
	@Named("ServiceC2Impl")
	private ServiceC c1PerThread;
	
	@Inject
	@Named("ServiceC2Impl")
	private ServiceC c2PerThread;
	
	
	
	
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
		
		System.out.println("Compara Singletons " + (c1Singleton == c2Singleton) );
		
		System.out.println("Compara PerLookUP " + (c1PerLook == c2PerLook));
		
		System.out.println("Compara PerThread " + (c1PerThread == c2PerThread));
		

	}
	
	
	
	
	

}
