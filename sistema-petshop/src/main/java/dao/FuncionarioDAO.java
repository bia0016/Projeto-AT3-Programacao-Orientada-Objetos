package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.petshop.Funcionario;

import hibernateUtil.HibernateUtil;

public class FuncionarioDAO {
    public void save(Funcionario funcionario) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(funcionario);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            throw e;
        }
    }

    public Funcionario findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.find(Funcionario.class, id);
        }
    }

    public List<Funcionario> listAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Funcionario", Funcionario.class).list();
        }
    }   
}
