/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.springdata;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.moto.crm.model.Product;
import pl.altkom.moto.crm.model.ProductAvailability;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/jpa-application-context.xml")
@TransactionConfiguration(defaultRollback = false)
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

        storage.save(availability);
        System.out.println("shouldChangeAvailability");
    }

    @Test
    public void shouldPageAllEntries() {
        Page<ProductAvailability> pagedProductsAvailabilities = storage.findAll(new PageRequest(0, 5));
        for (ProductAvailability availability : pagedProductsAvailabilities) {
            System.out.println(availability.getQuantity() + " " + availability.getProduct().getDescription() + " in store.");
        }
    }
}
