package edu.uptc.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "historiaclinica")
public class Historiaclinica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private int id;

    public Persona getPersona() {
        return persona;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Persona persona;

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Historiaclinica() {
    }

    public Historiaclinica(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
