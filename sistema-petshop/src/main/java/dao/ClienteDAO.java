package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.petshop.Cliente;

import hibernateUtil.HibernateUtil;

public class ClienteDAO {

    public void save(Cliente cliente) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(cliente);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public Cliente findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.find(Cliente.class, id);
        }
    }

    public List<Cliente> listAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Cliente", Cliente.class).list();
        }
    }
    
}
