package com.unlp.jyaa.di.service;

import javax.inject.Named;

import org.jvnet.hk2.annotations.Service;

/**
 * 
 * @author Andr�s Vazzano (andres.vazzano@gmail.com)
 *
 */
@Service
@Named
public class ServiceB2Impl implements ServiceB {

	@Override
	public void saludar() {
		
		System.out.println("Soy B2 " + hashCode() );
	}

}
