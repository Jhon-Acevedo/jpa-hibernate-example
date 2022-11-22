package edu.uptc.test;

import edu.uptc.entity.Enfermedad;
import jakarta.persistence.*;

public class TestInsertarEnfermedad {
    private static EntityManager em;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("JPA_PU");
        em = emf.createEntityManager();
        Enfermedad enfermedad = new Enfermedad();
        enfermedad.setId(4);
        enfermedad.setNombre("Viruela");
        enfermedad.setDescripcion("Enfermedad viral");
        em.getTransaction().begin();
        em.persist(enfermedad);
        em.getTransaction().commit();
        System.out.println("Enfermedad insertada");
    }
}
