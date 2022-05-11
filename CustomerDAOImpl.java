package one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CustomerDAOImpl implements CustomerDAO {

EntityManager entityManager;
	
	public CustomerDAOImpl() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory : "+entityManagerFactory );
		this.entityManager = entityManagerFactory.createEntityManager();
		System.out.println("EntityManager: "+entityManager);
	}
	@Override
	public List<Customer> findAllCustomer() {
		TypedQuery<Customer> query= entityManager.createQuery("from Customer", Customer.class);
		return query.getResultList();
		
	}

}
