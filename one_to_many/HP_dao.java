package one_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HP_dao
{
	public void insertvalue() 
	{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("many_to_one")	;
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Hospitaldto h1 = new Hospitaldto();
		h1.setId(1);
		h1.setName("apollo");

		Patientsdto p1 = new Patientsdto();
		p1.setId(1);
		p1.setName("riya");
		p1.setRoomno(101);

		Patientsdto p2 = new Patientsdto();
		p2.setId(1);
		p2.setName("riya");
		p2.setRoomno(101);

		Patientsdto p3 = new Patientsdto();
		p3.setId(1);
		p3.setName("riya");
		p3.setRoomno(101);

		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(h1);
		et.commit();

		System.out.println("data saved");
	}

	public static void updateData(Patientsdto p)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	}

	public static void getData()
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em=emf.createEntityManager();

		Patientsdto p= em.find(Patientsdto.class, 1);
		System.out.println(p.getId());
		System.out.println(p.getName());

		Hospitaldto h= p.getH();
		System.out.println(h.getId());
		System.out.println(h.getName());

	}

	public static void deletetData()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Patientsdto p = em.find(Patientsdto.class, 1);
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("deleted successfully");



	}



}
