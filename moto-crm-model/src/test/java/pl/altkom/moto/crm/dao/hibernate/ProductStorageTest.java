/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.hibernate;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import pl.altkom.moto.crm.model.Product;
import pl.altkom.moto.crm.model.ProductAvailability;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/session-factory-applicationContext.xml")
public class ProductStorageTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private Storage storage;

    @Autowired
    private ProductDao productDao;
    
    /**
     * Test of findOne method, of class ClientDAOImpl.
     */
    @Test
    public void shouldChangeAvailability() {
        ProductAvailability availability = new ProductAvailability();
        final Product product = new Product();
        productDao.save(product);
        
        availability.setProduct(product);
        availability.setQuantity(10);
        availability.setMinimalQuantity(5);
        availability.setMaximalQuantity(50);

        storage.changeAvailability(availability);
        System.out.println("shouldChangeAvailability");
    }
}