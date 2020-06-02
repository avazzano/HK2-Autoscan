package com.unlp.jyaa.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.glassfish.hk2.api.PerLookup;
import org.jvnet.hk2.annotations.Service;

@Service
@PerLookup
public class ServiceDImpl implements ServiceD {

	
	public void saludar() {
		System.out.println("Service D");				
	}
	
	@PostConstruct
	public void postConstruct() {
		//System.out.println("Service D1 postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		//System.out.println("Service D1 preDestroy");
	}

}
