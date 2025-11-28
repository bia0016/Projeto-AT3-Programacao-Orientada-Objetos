package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.petshop.Servico;
import hibernateUtil.HibernateUtil;

public class ServicoDAO {

    public void save(Servico servico) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(servico);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace(); 
        }
    }

    public Servico findById(Integer id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.find(Servico.class, id);
        }
    }

    public List<Servico> listAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Servico", Servico.class).list();
        }
    }
    
    public void delete(Servico servico) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.remove(servico);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}