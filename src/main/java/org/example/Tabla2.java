package org.example;

import jakarta.persistence.*;

@Entity
public class Tabla2 {
    @Id
    @SequenceGenerator(name = "tabla2_seq_generator", sequenceName = "tabla2_sequence", allocationSize = 5,initialValue=20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tabla2_seq_generator")
    private int id;

    private String nombre;

    public Tabla2(){}

    public Tabla2(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
