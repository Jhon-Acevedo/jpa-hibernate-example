package edu.uptc.test;


import edu.uptc.entity.Historiaclinica;
import edu.uptc.entity.Persona;
import jakarta.persistence.*;

public class TestInsertarPersona {

    private static EntityManager em;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("JPA_PU");
        em = emf.createEntityManager();
        Persona persona = new Persona();
        persona.setDocumento("1112223");
        persona.setTipo_documento("C");
        persona.setNombres("Joselo");
        persona.setApellidos("Vasquez");

        Historiaclinica hc = new Historiaclinica();
        hc.setId(1);
        hc.setPersona(persona);
        persona.setHistoriaclinica(hc);

        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();

        System.out.println("Persona insertada");
    }
}

