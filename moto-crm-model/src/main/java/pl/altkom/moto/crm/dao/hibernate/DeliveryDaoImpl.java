package pl.altkom.moto.crm.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.altkom.moto.crm.model.Client;
import pl.altkom.moto.crm.model.Delivery;

@Repository
public class DeliveryDaoImpl implements DeliveryDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Delivery findOne(long id) {
        return (Delivery) getSession().load(Delivery.class, id);
    }

    @Override
    public void save(Delivery entity) {
        getSession().saveOrUpdate(entity);
    }
}
