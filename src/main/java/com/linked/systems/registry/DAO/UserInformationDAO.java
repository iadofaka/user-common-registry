package com.linked.systems.registry.DAO;

import java.util.List;

import com.linked.systems.registry.model.UserInformation;


public interface UserInformationDAO {
	
	void save(UserInformation userInformation);
	
	void update(UserInformation userInformation);
	
	void delete(UserInformation userInformation);
	
	List<UserInformation> findAllUser();
	
	List<UserInformation> findAllUserActive();
	
	UserInformation findUserInformationByAlias(String alias);
	
}
