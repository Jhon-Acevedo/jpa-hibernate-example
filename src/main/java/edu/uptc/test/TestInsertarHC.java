package edu.uptc.test;

import edu.uptc.entity.Historiaclinica;
import edu.uptc.entity.Persona;
import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;

public class TestInsertarHC {
    private static EntityManager em;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("JPA_PU");
        em = emf.createEntityManager();
        Historiaclinica hc = new Historiaclinica();
        hc.setId(11);
        hc.setPersona(new Persona("10001", "C", "Jhon", "Acevedo", Date.valueOf(LocalDate.now())));
        em.getTransaction().begin();
        em.persist(hc);
        em.getTransaction().commit();
        System.out.println("Se inserto la historia clinica");
    }
}

