package one_to_many;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HB_dao
{
	public void insertvalue() 
	   {

		Hospitaldto h = new Hospitaldto();
		h.setId(1);
		h.setName("apollo");
		
		Branchdto b1 = new Branchdto();
		b1.setId(1);
		b1.setBranchName("mumbai");
		b1.setPincode(455844);
       
		Branchdto b2 = new Branchdto();
		b2.setId(2);
		b2.setBranchName("bangalore");
		b2.setPincode(455844);

		Branchdto b3 = new Branchdto();
		b3.setId(3);
		b3.setBranchName("pune");
		b3.setPincode(455844);

		List<Branchdto> branchesList=new ArrayList<Branchdto>();  
		branchesList.add(b1);
		branchesList.add(b2);
		branchesList.add(b3);
		
		h.setBranches(branchesList);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		et.begin();
		em.persist(h); 
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();

		System.out.println("saved successfully");
		
	}
	
	public static void updateData(Hospitaldto h)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	}
	
	
	public static void getData()
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();

		Hospitaldto h=em.find(Hospitaldto.class, 1);
		System.out.println(h.getId());
		System.out.println(h.getName());

		List<Branchdto> branches=h.getBranches();
		for( Branchdto b: branches)
		{
			System.out.println(b.getId());
			System.out.println(b.getBranchName());
			System.out.println(b.getPincode());
		}
		
	}
	
	public static void deleteData()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		 EntityManager em=emf.createEntityManager();
		 EntityTransaction et=em.getTransaction();
		 Hospitaldto h1 = em.find(Hospitaldto.class, 1);
			et.begin();
			em.persist(h1);
			et.commit();
			System.out.println("deleted successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
