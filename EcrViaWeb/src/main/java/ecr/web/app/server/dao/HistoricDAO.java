package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.HistoricDTO;
@Repository("Obj_Historic")
public class HistoricDAO extends AbstractDAOMethods<Long, HistoricDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	public List<HistoricDTO> getProByTran(long idtransaction){
		String queryString = "select entity from  HistoricDTO entity where entity.idtransaction=:idtransaction";
		TypedQuery<HistoricDTO> query = getEntityManager().createQuery(queryString, HistoricDTO.class);
		query.setParameter("idtransaction", idtransaction);
		return query.getResultList();
	}

	public List<HistoricDTO> getProByRange(String code_range) {
		String queryString = "select entity from  HistoricDTO entity where entity.code_range=:code_range";
		TypedQuery<HistoricDTO> query = getEntityManager().createQuery(queryString, HistoricDTO.class);
		query.setParameter("code_range", code_range);

		return query.getResultList();
	}

}