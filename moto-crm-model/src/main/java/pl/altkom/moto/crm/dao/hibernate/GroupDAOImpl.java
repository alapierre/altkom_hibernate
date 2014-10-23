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
import pl.altkom.moto.crm.model.Group;

/**
 *
 * @author Administrator
 */
@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {

        return sessionFactory.getCurrentSession();
    }

    @Override
    public Group findOne(long id) {
        return (Group) getSession().load(Group.class, id);
    }

    @Override
    public void save(Group entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public void flush() {
        getSession().flush();
    }
}
