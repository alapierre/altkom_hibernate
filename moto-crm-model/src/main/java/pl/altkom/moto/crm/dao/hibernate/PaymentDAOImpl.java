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
import pl.altkom.moto.crm.model.Invoice;
import pl.altkom.moto.crm.model.Payment;

/**
 *
 * @author Administrator
 */
@Repository
public class PaymentDAOImpl implements PaymentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Payment findOne(long id) {
        return (Payment) getSession().load(Payment.class, id);
    }

    @Override
    public void save(Payment payment) {
        getSession().saveOrUpdate(payment);
    }

    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }

}
