package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Tabla2 {
    @Id
    @SequenceGenerator(name = "tabla2_seq_generator", sequenceName = "tabla2_sequence", allocationSize = 5,initialValue=20)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tabla2_seq_generator")
    private int id;

    private String nombre;

    @Transient
    private String apodo;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_s")
    private Tipos tipo;

    @Temporal(TemporalType.TIME)
    private LocalTime fecha;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha2;

    private java.sql.Date fecha3;

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

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
}
