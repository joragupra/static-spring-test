package com.joragupra.spring.services;

/**
 * <p>
 * Implementaci&oacute;n concreta de AbstractFactory. &Uacute;nicamente
 * sirve para poder inyectar el servicio de negocio en el campo est&aacute;tico
 * de AbstractFactory.
 * </p>
 * 
 * @author jagudopr
 *
 */
public class MediatorConcreteFactory extends AbstractFactory {

	@Override
	public void createObject() {
		// TODO Auto-generated method stub

	}
	
	public void setBusinessService(BusinessService service){
		AbstractFactory.setService(service);
	}

}
