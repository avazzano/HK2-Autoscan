package com.unlp.jyaa.di.service;

import javax.inject.Named;

import org.glassfish.hk2.api.PerThread;
import org.jvnet.hk2.annotations.Service;

/**
 * 
 * @author Andrés Vazzano (andres.vazzano@gmail.com)
 *
 */
@Service
@PerThread
@Named("ServiceC2Impl")
public class ServiceC2Impl implements ServiceC {

	@Override
	public void saludar() {
		System.out.println("Service C2");
		
	}

}
