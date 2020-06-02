package com.unlp.jyaa.di.utils;

import org.glassfish.hk2.api.JustInTimeInjectionResolver;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * 
 * @author Andrés Vazzano (andres.vazzano@gmail.com)
 *
 */
public class MyApplicationBinder extends AbstractBinder {
	  
	
		@Override
	    protected void configure() {
	    		    	
			bind( JustInTimeServiceResolver.class ).to( JustInTimeInjectionResolver.class );
	    	
	    }	

	}