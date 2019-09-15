import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestaoescolar");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Aluno aluno = new Aluno();
		aluno.setId(10);
		aluno.setNome("Jeilson");
		
	
		
		em.persist(aluno);

		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
