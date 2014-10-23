/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.altkom.moto.crm.model.Client;

/**
 *
 * @author Administrator
 */
@Repository
public class ClientDAOImpl implements ClientDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public Client findOne(long id) {
        return (Client) getSession().load(Client.class, id);
    }
    
    @Override
    public void save(Client entity) {
        getSession().saveOrUpdate(entity);
    }
}
