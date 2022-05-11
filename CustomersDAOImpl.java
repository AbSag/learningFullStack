package one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CustomersDAOImpl implements CustomersDAO {

EntityManager entityManager;
	
	public CustomersDAOImpl() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory : "+entityManagerFactory );
		this.entityManager = entityManagerFactory.createEntityManager();
		System.out.println("EntityManager: "+entityManager);
	}
	@Override
	public List<Customers> findAllCustomers() {
		TypedQuery<Customers> query= entityManager.createQuery("from Customers", Customers.class);
		return query.getResultList();
		
	}

}
