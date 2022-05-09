import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudTest {

	public static void main(String[] args) {
		
		System.out.println("Trying to read persistence.xml file...");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");

		EntityManager em=emf.createEntityManager();
		System.out.println("EntityManager created....");

		EntityTransaction et=em.getTransaction();	
		System.out.println("EntityTransaction created....");

		//System.out.println("Trying to create record.....");
		
		Flight theFlight=new Flight();
		
//				theFlight.setFlightNumber("103");
//				theFlight.setFlighName("Air France");
//				theFlight.setFlightSource("Mumbai");
//				theFlight.setFlightDestination("Paris");
//				theFlight.setFlightTicketCost(69000);
//				theFlight.setNumberOfPassengers(224);
//				theFlight.setFlightDepartureFromSource(LocalDateTime.now());
//				theFlight.setFlightArrivalAtDestination(LocalDateTime.now());
//				
//				et.begin();
//				em.persist(theFlight);
//			et.commit();
		
			System.out.println("=================");
//			
//			et.begin();
//			Flight f = em.find(Flight.class, 101);
//			f.setFlightDestination("USA");
//			em.merge(f);
//			et.commit();
				
		
//			System.out.println("Created the record.....");
			
//			System.out.println("Getting one record.....");
			
//			et.begin();
//		
//			Flight f1=em.find(Flight.class, 102);
//			
//			
//			et.commit();
			
//			et.begin();
//			Flight f = em.find(Flight.class, 101);
//			em.remove(f);
//			et.commit();
			
//			
//			Query q=em.createNativeQuery("SELECT * FROM Flight_info" , Flight.class);
//			
//			List<Flight> f1=(List<Flight>) q.getResultList();
//			System.out.println("Getting list of records...");
//			
//			for(Flight list: f1) {
//				
//				System.out.println("Flight Number is" +list.getFlightNumber());
//				System.out.println("Flight Number is" +list.getFlightName());
//				System.out.println("Flight Number is" +list.getFlightSource());
//				System.out.println("Flight Number is" +list.getFlightDestination());
//				System.out.println("Flight Number is" +list.getFlightTicketCost());
//				System.out.println("Flight Number is" +list.getFlightDepartureFromSource());
//				System.out.println("Flight Number is" +list.getFlightArrivalAtDestination());
//
//			et.commit();
//				
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
