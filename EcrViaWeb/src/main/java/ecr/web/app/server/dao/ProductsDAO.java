package ecr.web.app.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ecr.web.app.server.AbstractDAOMethods;
import ecr.web.app.shared.dto.ProductsDTO;


@Repository("Obj_Produit")
public class ProductsDAO extends AbstractDAOMethods<Long, ProductsDTO> {

	@PersistenceContext(unitName = "pers_name_def")
	EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	public List<ProductsDTO> getProduitByRayon(String code_range){
		String queryString = "select entity from  ProductsDTO entity where entity.code_range=:rayon";
		TypedQuery<ProductsDTO> query = getEntityManager().createQuery(queryString, ProductsDTO.class);
		query.setParameter("rayon", code_range);
		return query.getResultList();
	}

	public List<ProductsDTO> getProduitBydiscount(String id_discount) {
		String queryString = "select entity from  ProductsDTO entity where entity.id_discount=:id_discount";
		TypedQuery<ProductsDTO> query = getEntityManager().createQuery(queryString, ProductsDTO.class);
		query.setParameter("id_discount", id_discount);
		return query.getResultList();
	}

}
