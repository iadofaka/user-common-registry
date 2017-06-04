package com.linked.systems.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.linked.systems.registry.Manager.PositionsCatalogManager;
import com.linked.systems.registry.Manager.UserInformationManager;
import com.linked.systems.registry.model.PositionsCatalog;
import com.linked.systems.registry.model.UserInformation;


public class UserRegistryService {

	ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"spring.xml");

	private  UserInformationManager userInformationManager = (UserInformationManager)
			ctx.getBean("userInformationManagerImpl");
	private PositionsCatalogManager positionsCatalogManager = (PositionsCatalogManager)
			ctx.getBean("positionsCatalogManagerImpl");

	public void  save(UserInformation userInformation) {
		userInformationManager.save(userInformation);
	}

	public	void update(UserInformation userInformation){
		userInformationManager.update(userInformation);
	}

	void delete(UserInformation userInformation){
		userInformationManager.delete(userInformation);
	}

	public List<UserInformation> findAllUser(){
		return userInformationManager.findAllUser();
	}

	public UserInformation findUserInformationById(String alias){
		return userInformationManager.findUserInformationByAlias(alias);
	}

	List<UserInformation> findAllUserActive(){
		return userInformationManager.findAllUserActive();
	}

	public void save(PositionsCatalog positionsCatalog){
		positionsCatalogManager.save(positionsCatalog);
	}

	public void update(PositionsCatalog positionsCatalog){
		positionsCatalogManager.update(positionsCatalog);
	}

	public void delete(PositionsCatalog positionsCatalog){
		positionsCatalogManager.delete(positionsCatalog);
	}
	
	public List<PositionsCatalog> findAllPosition(){
		return positionsCatalogManager.findAllPosition();
	}

	public List<PositionsCatalog> findAllPositionActive(){
		return positionsCatalogManager.findAllPositionActive();
	}

	public PositionsCatalog findPositionsCatalogByIdByName(String name){
		return positionsCatalogManager.findPositionsCatalogByIdByName(name);
	}
}
