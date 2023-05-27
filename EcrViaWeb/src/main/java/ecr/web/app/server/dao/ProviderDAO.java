package ecr.web.app.server.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;



import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.ProviderDTO;

@Repository("Obj_provider")
public class ProviderDAO extends AbstractDAOMethods<Long, ProviderDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public ProviderDTO getclient(long id){
		String queryString = "select entity from  ProviderDTO entity where entity.id=:id";
		TypedQuery<ProviderDTO> query = getEntityManager().createQuery(queryString, ProviderDTO.class);
		query.setParameter("id", id);
		return query.getSingleResult();
		
	}

}
