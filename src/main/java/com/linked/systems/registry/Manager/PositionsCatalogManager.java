package com.linked.systems.registry.Manager;

import java.util.List;

import com.linked.systems.registry.model.PositionsCatalog;

public interface PositionsCatalogManager {
	
	void save(PositionsCatalog positionsCatalog);
	
	void update(PositionsCatalog positionsCatalog);
	
	void delete(PositionsCatalog positionsCatalog);
	
	List<PositionsCatalog> findAllPosition();
	
	List<PositionsCatalog> findAllPositionActive();
	
	PositionsCatalog findPositionsCatalogByIdByName(String name);
}
