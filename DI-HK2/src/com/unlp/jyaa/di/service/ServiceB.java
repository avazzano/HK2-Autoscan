package com.unlp.jyaa.di.service;


import org.glassfish.hk2.api.PerThread;
import org.jvnet.hk2.annotations.Contract;

/**
 * 
 * @author Andrés Vazzano (andres.vazzano@gmail.com)
 *
 */
@Contract
@PerThread
public interface ServiceB {

	public void saludar();
}
