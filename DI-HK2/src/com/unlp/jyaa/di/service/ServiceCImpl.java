package com.unlp.jyaa.di.service;

import org.jvnet.hk2.annotations.Service;

/**
 * 
 * @author Andrés Vazzano (andres.vazzano@gmail.com)
 *
 */
@Service
public class ServiceCImpl implements ServiceC {

	public void saludar() {
		System.out.println("Service C");
		
	}

}
