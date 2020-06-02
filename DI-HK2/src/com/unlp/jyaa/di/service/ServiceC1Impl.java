package com.unlp.jyaa.di.service;

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
@Named("ServiceC1Impl")
public class ServiceC1Impl implements ServiceC {

	
	public void saludar() {
		System.out.println("Service C1");
				
	}

}
