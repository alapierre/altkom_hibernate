/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.altkom.moto.crm.model.Product;
import pl.altkom.moto.crm.model.ProductAvailability;

/**
 *
 * @author Administrator
 */
@Repository
public class ProductStorage implements Storage {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public ProductAvailability checkAvailability(Product product) {
        Property productProperty = Property.forName("product");

        return (ProductAvailability) getSession().createCriteria(ProductAvailability.class)
                .add(productProperty.eq(product))
                .uniqueResult();
    }

    @Override
    public void changeAvailability(ProductAvailability productAvailability) {
        getSession().saveOrUpdate(productAvailability);
    }
}
