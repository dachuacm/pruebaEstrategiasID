package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePrueba");

        EntityManager em=emf.createEntityManager();

/*    for(int i=0;i<5;i++) {
        Tabla1 renglonT1 = new Tabla1("otra"+i, 25.3f, 85+1);

        em.getTransaction().begin();
        em.persist(renglonT1);
        em.getTransaction().commit();

    }
*/
        for(int i=0;i<5;i++) {
            Tabla2 renglonT2;
            char[] vocal={'a','e','i','o','u'};
            if(i<4){
            renglonT2 = new Tabla2("P"+vocal[i]+"to");}
            else  {
                renglonT2 = new Tabla2("Juan");


            }
            renglonT2.setTipo(i%2==0?Tipos.BPOS:Tipos.ANEG);
            em.getTransaction().begin();
            em.persist(renglonT2);
            em.getTransaction().commit();

        }

/*
        for(int i=0;i<5;i++) {
            Tabla3 renglonT3 = new Tabla3(500+1,"nada");

            em.getTransaction().begin();
            em.persist(renglonT3);
            em.getTransaction().commit();

        }
*/



    }
}