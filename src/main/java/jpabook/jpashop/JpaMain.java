package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        // transaction start 하기
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{


            tx.commit();
            // transaction 종료하기
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();


    }
}
