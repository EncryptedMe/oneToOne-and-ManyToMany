package TrainingAllInOne;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
		em.getTransaction().begin();
		
		
		/*
		 * Projects p1,p2,p3,p4,p5,p6; p1 = new Projects("Pyhton"); p2 = new
		 * Projects("Lib"); p3 = new Projects("FoodOrdering"); p4 = new
		 * Projects("javabasic"); p5 = new Projects("lifelinesol"); p6 = new
		 * Projects("ADSABSAKA");
		 * 
		 * Set<Projects> E1pro=new HashSet<>(); Set<Projects> E2pro=new HashSet<>();
		 * Set<Projects> E3pro=new HashSet<>();
		 * E1pro.add(p1);E1pro.add(p2);E1pro.add(p6);
		 * E2pro.add(p3);E2pro.add(p1);E2pro.add(p6);
		 * E3pro.add(p5);E3pro.add(p4);E3pro.add(p3);
		 * 
		 * Engineers e1,e2,e3; e1 = new Engineers("Sajal",E1pro); e2 = new
		 * Engineers("Parry",E2pro); e3 = new Engineers("PJ",E3pro);
		 * 
		 * em.persist(e1); em.persist(e2); em.persist(e3)
		 */;
		 
		 
		
		  Contact c1,c2,c3; Student s1,s2,s3; s1 = new Student("1A"); s2 = new
		  Student("1b"); s3 = new Student("2A");
		  
		  c1=new Contact("FZD", 905765678, s1); c2=new Contact("MTJ", 89231, s2);
		  c3=new Contact("FZD", 5678, s3); em.persist(c1); em.persist(c2);
		  em.persist(c3);
		 
	
		/*
		 * Student s = em.find(Student.class, 3); System.out.println(s); em.remove(s);
		 */
		
		
		/*
		 * em.flush(); Scanner scan = new Scanner(System.in);
		 * System.out.print("Enter int: "); int a = scan.nextInt();
		 * System.out.println(a); if (a==1) em.detach(em);
		 */
		 
		em.getTransaction().commit();
		System.out.println("Done!");
	}

}
