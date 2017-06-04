package com.linked.systems.registry.Manager;

import java.util.List;

import com.linked.systems.registry.model.UserInformation;

public interface UserInformationManager {
	
	void save(UserInformation userInformation);
	
	void update(UserInformation userInformation);
	
	void delete(UserInformation userInformation);
	
	List<UserInformation> findAllUser();
	
	List<UserInformation> findAllUserActive();
	
	UserInformation findUserInformationByAlias(String alias);
}
