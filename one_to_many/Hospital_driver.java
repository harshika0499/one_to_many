package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Hospital_driver
{
	public static void main(String[] args)
	{
		Hospitaldto h=new Hospitaldto();
		h.setId(1);
		h.setName("apollo");

		Branchdto b=new Branchdto();
		b.setId(1);
		b.setBranchName("Pune");
		b.setPincode(411258);

		Branchdto b1=new Branchdto();
		b1.setId(2);
		b1.setBranchName("Nagpur");
		b1.setPincode(401256);

		Branchdto b2=new Branchdto();
		b2.setId(3);
		b2.setBranchName("Mumbai");
		b2.setPincode(421058);

		List<Branchdto> branchesList=new ArrayList<Branchdto>();  //branchesList is list variable
		branchesList.add(b);
		branchesList.add(b1);
		branchesList.add(b2);

		h.setBranches(branchesList); // we are adding or setting branches list to the hospital

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("HarshuN");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		et.begin();
		em.persist(h); 
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		et.commit();

		System.out.println("saved successfully");


	}

}









//to save in DB, datatype of h is hospital so data will be inserted in hospital table only , so if we pass brances directly , datatype
//of branch is list so in DB there no table called List. therefore we are passing list directly , we are passing each object seperately.
		
