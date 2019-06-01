package TrainingAllInOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class test {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
		em.getTransaction().begin();
		int a = em.createQuery("Delete Table engineers cascade").executeUpdate();
		em.getTransaction().commit();
	}

}
