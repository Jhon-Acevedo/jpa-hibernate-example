package edu.uptc.test;

import edu.uptc.entity.Enfermedad;
import edu.uptc.entity.Persona;
import jakarta.persistence.*;

public class TestEnfermedadPersona {
    private static EntityManager em;
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setDocumento("1049655068");
        persona1.setTipo_documento("C");
        persona1.setNombres("Jhon");
        persona1.setApellidos("Acevedo");

        Persona persona2 = new Persona();
        persona2.setDocumento("1112224");
        persona2.setTipo_documento("C");
        persona2.setNombres("Juan");
        persona2.setApellidos("Perez");

        Persona persona3 = new Persona();
        persona3.setDocumento("1112225");
        persona3.setTipo_documento("C");
        persona3.setNombres("Maria");
        persona3.setApellidos("Gomez");

        Enfermedad enfermedad1 = new Enfermedad();
        enfermedad1.setId(10);
        enfermedad1.setNombre("Covid");
        enfermedad1.setDescripcion("Enfermedad causada por el virus SARS-CoV-2");

        Enfermedad enfermedad2 = new Enfermedad();
        enfermedad2.setId(11);
        enfermedad2.setNombre("Gripe");
        enfermedad2.setDescripcion("Enfermedad causada por el virus Influenza");

        Enfermedad enfermedad3 = new Enfermedad();
        enfermedad3.setId(12);
        enfermedad3.setNombre("Dengue");
        enfermedad3.setDescripcion("Enfermedad causada por el virus Dengue");

        persona1.addEnfermedad(enfermedad1);
        persona1.addEnfermedad(enfermedad2);

        persona2.addEnfermedad(enfermedad3);

        persona3.addEnfermedad(enfermedad1);
        persona3.addEnfermedad(enfermedad2);
        persona3.addEnfermedad(enfermedad3);


        emf = Persistence.createEntityManagerFactory("JPA_PU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(persona1);
        em.persist(persona2);
        em.persist(persona3);
        em.getTransaction().commit();

        System.out.println("Se agrego con exito la persona con enfermedades");
    }
}
