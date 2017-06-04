package com.linked.systems.registry.ManagerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.linked.systems.registry.DAO.PositionsCatalogDAO;
import com.linked.systems.registry.Manager.PositionsCatalogManager;
import com.linked.systems.registry.model.PositionsCatalog;

public class PositionsCatalogManagerImpl implements PositionsCatalogManager {
	
	@Autowired
	PositionsCatalogDAO positionsCatalogDAO;

	@Override
	public void save(PositionsCatalog positionsCatalog) {
		positionsCatalogDAO.save(positionsCatalog);
		
	}

	@Override
	public void update(PositionsCatalog positionsCatalog) {
		positionsCatalogDAO.update(positionsCatalog);
		
	}

	@Override
	public void delete(PositionsCatalog positionsCatalog) {
		positionsCatalogDAO.delete(positionsCatalog);
	}

	@Override
	public List<PositionsCatalog> findAllPosition() {
		return positionsCatalogDAO.findAllPosition();
	}

	@Override
	public List<PositionsCatalog> findAllPositionActive() {
		return positionsCatalogDAO.findAllPositionActive();
	}

	@Override
	public PositionsCatalog findPositionsCatalogByIdByName(String name) {
		return positionsCatalogDAO.findPositionsCatalogByIdByName(name);
	}
}
