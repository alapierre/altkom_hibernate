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
import pl.altkom.moto.crm.model.Payment;
import pl.altkom.moto.crm.model.Settlement;

/**
 *
 * @author Administrator
 */
@Repository
public class SettlementDAOImpl implements SettlementDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Settlement findOne(long id) {
        return (Settlement) getSession().load(Settlement.class, id);
    }

    @Override
    public void save(Settlement settlement) {
        getSession().saveOrUpdate(settlement);
    }

    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
}
