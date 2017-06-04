package com.linked.systems.registry.DAO;

import java.util.List;
import com.linked.systems.registry.model.PositionsCatalog;

public interface PositionsCatalogDAO {
	
	void save(PositionsCatalog positionsCatalog);
	
	void update(PositionsCatalog positionsCatalog);
	
	void delete(PositionsCatalog positionsCatalog);
	
	List<PositionsCatalog> findAllPosition();
	
	List<PositionsCatalog> findAllPositionActive();
	
	PositionsCatalog findPositionsCatalogByIdByName(String name);

}
