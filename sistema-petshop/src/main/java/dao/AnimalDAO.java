package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.petshop.Animal;
import com.petshop.Cliente;

import hibernateUtil.HibernateUtil;

public class AnimalDAO {

    public void save(Animal animal) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(animal);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public Animal findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.find(Animal.class, id);
        }
    }

    public List<Animal> listAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Animal", Animal.class).list();
        }
    }
   
}
