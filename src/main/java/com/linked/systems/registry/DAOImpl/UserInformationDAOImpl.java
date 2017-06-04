package com.linked.systems.registry.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.linked.systems.registry.DAO.UserInformationDAO;
import com.linked.systems.registry.model.UserInformation;

@Repository
public class UserInformationDAOImpl implements UserInformationDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(UserInformation userInformation) {
		entityManager.persist(userInformation);
	}

	@Override
	public void update(UserInformation userInformation) {
		entityManager.merge(userInformation);
		
	}

	@Override
	public void delete(UserInformation userInformation) {
		userInformation.setActive(false);
		entityManager.merge(userInformation);
		
	}

	@Override
	public List<UserInformation> findAllUser() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<UserInformation> cq = builder.createQuery(UserInformation.class);
		Root<UserInformation> root = cq.from(UserInformation.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}
	

	@Override
	public List<UserInformation> findAllUserActive() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserInformation> cq = builder.createQuery(UserInformation.class);
		Root<UserInformation> root = cq.from(UserInformation.class);
		cq.select(root).where(builder.equal(root.get("isActive"), true));
		return entityManager.createQuery(cq).getResultList();
	}

	@Override
	public UserInformation findUserInformationByAlias(String alias) {
		UserInformation userInformation = null;
		String sqlQuery = 
				"SELECT a FROM UserInformation a WHERE a.alias = :alias";
		TypedQuery<UserInformation> query =  entityManager.createQuery(sqlQuery, UserInformation.class);
		query.setParameter("alias", alias);
		try{
			userInformation = query.getSingleResult();
		}catch (NoResultException e) {
			System.out.println("There are not results");
		}
		return userInformation;
	}


}
