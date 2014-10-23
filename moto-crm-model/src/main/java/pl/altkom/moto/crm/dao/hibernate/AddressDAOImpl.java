/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.altkom.moto.crm.model.Address;

public class AddressDAOImpl implements AddressDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Address findOne(long id) {
        return (Address) getSession().load(Address.class, id);
    }

    @Override
    public void save(Address entity) {
        getSession().saveOrUpdate(entity);
    }

}
