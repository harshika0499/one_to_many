package one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Fetch_details
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("HarshuN");
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
}























//System.out.println(h.getBranches()); ref of branches
//System.out.println(Hospital.class);-- fully qualified path of class
//after fetching it will give an obj and  that obj we are storing inside variable(h).if it is unable to find still it will generate 
//object but inside object it will store "null".