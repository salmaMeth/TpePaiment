package ecr.web.app.server.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.OptionDTO;

@Repository("Obj_Option")
public class OptionDAO extends AbstractDAOMethods<Long, OptionDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public void deleteOption(){
	 String queryString = "DELETE  from  OptionDTO entity";
		TypedQuery<OptionDTO> query = getEntityManager().createQuery(queryString, OptionDTO.class);
		query.executeUpdate();
	}
}
