package one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BA_dao 
{
	public void insertvalue() 
	{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one")	;
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Branchdto b = new Branchdto();
		b.setId(1);
		b.setPincode(457844);
		b.setBranchName("pune");
		
		Addressdto a = new Addressdto();
		a.setId(1);
		a.setPincode(589647);
		a.setStreetname("MG_road");
		
		et.begin();
		em.persist(b);
		em.persist(a);
		et.commit();
		
		System.out.println("data saved");
	}
	
	public void updatevalue(Addressdto ad)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	}
	public void getvalue()
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em=emf.createEntityManager();

		Branchdto b1= em.find(Branchdto.class, 1);
		System.out.println(b1.getId());
		System.out.println(b1.getBranchName());

		Addressdto a1 = b1.getAd();
		System.out.println(a1.getId());
		System.out.println(a1.getPincode());
		System.out.println(a1.getStreetname());

	}
	
	public void deletetvalue()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Addressdto a2 = em.find(Addressdto.class, 1);
		et.begin();
		em.persist(a2);
		et.commit();
		System.out.println("deleted successfully");
	}
	
	
	
}
