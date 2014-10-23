/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.hibernate;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.altkom.moto.crm.model.Invoice;

/**
 *
 * @author Administrator
 */

@Repository
public class InvoiceDaoImpl implements InvoiceDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Invoice findOne(long id) {
        return (Invoice) getSession().load(Invoice.class, id);
    }

    @Override
    public void save(Invoice entity) {
        getSession().saveOrUpdate(entity);
    }
    
    protected Session getSession() {
        sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
}
