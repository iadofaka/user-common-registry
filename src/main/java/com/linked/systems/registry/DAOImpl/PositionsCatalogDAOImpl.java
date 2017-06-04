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

import com.linked.systems.registry.DAO.PositionsCatalogDAO;
import com.linked.systems.registry.model.PositionsCatalog;

@Repository
public class PositionsCatalogDAOImpl implements PositionsCatalogDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(PositionsCatalog positionsCatalog) {
		entityManager.persist(positionsCatalog);
	}

	@Override
	public void update(PositionsCatalog positionsCatalog) {
		entityManager.merge(positionsCatalog);
		
	}

	@Override
	public void delete(PositionsCatalog positionsCatalog) {
		positionsCatalog.setActive(false);
		entityManager.merge(positionsCatalog);
		
	}

	@Override
	public List<PositionsCatalog> findAllPosition() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<PositionsCatalog> cq = builder.createQuery(PositionsCatalog.class);
		Root<PositionsCatalog> root = cq.from(PositionsCatalog.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	@Override
	public PositionsCatalog findPositionsCatalogByIdByName(String name) {
		PositionsCatalog positionsCatalog = null;
		String sqlQuery = 
				"SELECT a FROM PositionsCatalog a WHERE a.positionName = :name";
		TypedQuery<PositionsCatalog> query =  entityManager.createQuery(sqlQuery, PositionsCatalog.class);
		query.setParameter("name", name);
		try{
			positionsCatalog = query.getSingleResult();
		}catch (NoResultException e) {
			System.out.println("There are not results");
		}
		return positionsCatalog;
	}

	@Override
	public List<PositionsCatalog> findAllPositionActive() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<PositionsCatalog> cq = builder.createQuery(PositionsCatalog.class);
		Root<PositionsCatalog> root = cq.from(PositionsCatalog.class);
		cq.select(root).where(builder.equal(root.get("isActive"), true));
		return entityManager.createQuery(cq).getResultList();
	}
}