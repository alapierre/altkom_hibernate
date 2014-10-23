package pl.altkom.moto.crm.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.altkom.moto.crm.model.Delivery;
import pl.altkom.moto.crm.model.Provider;

@Repository
public class ProviderDaoImpl implements ProviderDao{

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Provider findOne(long id) {
        return (Provider) getSession().load(Provider.class, id);
    }

    @Override
    public void save(Provider entity) {
        getSession().saveOrUpdate(entity);
    }
}
