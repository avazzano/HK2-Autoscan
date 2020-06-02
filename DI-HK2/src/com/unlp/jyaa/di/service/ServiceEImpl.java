package com.unlp.jyaa.di.service;

import javax.inject.Named;

import org.glassfish.hk2.api.PerThread;
import org.jvnet.hk2.annotations.Service;

@Service
@PerThread
public class ServiceEImpl implements ServiceE {

	@Override
	public void saludar() {
		System.out.println("Service E");
		
	}

}
