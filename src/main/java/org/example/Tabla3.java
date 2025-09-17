package org.example;

import jakarta.persistence.*;

@Entity
public class Tabla3 {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @TableGenerator(
            name = "tabla_generador",
            table = "SECUENCIA_IDS", // Nombre de la tabla que almacena la secuencia
            pkColumnName = "nombre_secuencia", // Nombre de la columna que almacena el nombre de la secuencia
            valueColumnName = "valor_secuencia", // Nombre de la columna que almacena el valor actual de la secuencia
            pkColumnValue = "MI_ENTIDAD_SEQ", // Valor para identificar la secuencia de esta entidad
            allocationSize = 2 // Cantidad de IDs a asignar por vez (puede ser mayor que 1)
    )
    private long id;

    private int dato2;
    private String dato1;

    public Tabla3(){}
    public Tabla3(int dato2, String dato1) {
        this.dato2 = dato2;
        this.dato1 = dato1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDato2() {
        return dato2;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }
}
