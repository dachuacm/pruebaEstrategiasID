package org.example;

import jakarta.persistence.*;

//@Entity
public class Tabla2 {
  /*  @Id
    @SequenceGenerator(name = "tabla2_seq_generator", sequenceName = "tabla2_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tabla2_seq_generator")
    */private int id;

    private String nombre;

}
