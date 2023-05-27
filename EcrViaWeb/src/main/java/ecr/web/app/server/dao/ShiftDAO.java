package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.ShiftDTO;



@Repository("Obj_shift")
public class ShiftDAO extends AbstractDAOMethods<Long, ShiftDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	public List<ShiftDTO> getShiftbyCaisse(long id_caisse){
		String queryString = "select entity from  ShiftDTO entity where entity.id_caisse=:id_caisse";
		TypedQuery<ShiftDTO> query = getEntityManager().createQuery(queryString, ShiftDTO.class);
		query.setParameter("id_caisse", id_caisse);
		  return query.getResultList();
				  
		
	}
}
