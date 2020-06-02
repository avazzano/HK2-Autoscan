package com.unlp.jyaa.di.test;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;

import com.unlp.jyaa.di.service.ServiceA;
import com.unlp.jyaa.di.utils.MyApplicationBinder;

/**
 * 
 * @author Andrés Vazzano (andres.vazzano@gmail.com)
 *
 */
public class TestMain {

	public static void main(String[] args) {

		//Crea service locator
		ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
		
		ServiceLocatorUtilities.enablePerThreadScope(locator);
		
		//Bindea las dependencias.
		ServiceLocatorUtilities.bind(locator, new MyApplicationBinder());
				
				
		//Obtiene un servicio
		ServiceA myService = locator.getService(ServiceA.class);
						
		myService.saludar();
		
		myService.testScopes();
		

		//Utilitario que muestra los servicios por ServiceLocator
		System.out.println("Locator: ");
		ServiceLocatorUtilities.dumpAllDescriptors(locator);
		
				
	}

}
