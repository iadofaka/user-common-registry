package com.linked.systems.registry.ManagerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.linked.systems.registry.DAO.UserInformationDAO;
import com.linked.systems.registry.Manager.UserInformationManager;
import com.linked.systems.registry.model.UserInformation;

public class UserInformationManagerImpl implements UserInformationManager {
	
	@Autowired
	private UserInformationDAO userInformationDao;

	@Override
	public void save(UserInformation userInformation) {
		userInformationDao.save(userInformation);
		
	}

	@Override
	public void update(UserInformation userInformation) {
		userInformationDao.update(userInformation);
		
	}

	@Override
	public void delete(UserInformation userInformation) {
		userInformationDao.delete(userInformation);
		
	}

	@Override
	public List<UserInformation> findAllUser() {
		return userInformationDao.findAllUser();
		
	}

	@Override
	public UserInformation findUserInformationByAlias(String alias) {
		return userInformationDao.findUserInformationByAlias(alias);
	}

	@Override
	public List<UserInformation> findAllUserActive() {
		return userInformationDao.findAllUserActive();
	}

}