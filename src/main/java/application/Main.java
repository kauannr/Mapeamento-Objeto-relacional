package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import application.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(null, "Carlos da Silva", "carlo@gmail.com");
        Pessoa pessoa2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa pessoa3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager entityManager = EntityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Pessoa p = entityManager.find(Pessoa.class, 2);

        entityManager.getTransaction().commit();
        System.out.println(p);

        entityManager.close();
        entityManager.close();

    }
}