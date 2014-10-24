/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.springdata;

import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.moto.crm.dao.hibernate.*;
import pl.altkom.moto.crm.model.Client;
import pl.altkom.moto.crm.model.InviceItem;
import pl.altkom.moto.crm.model.Invoice;
import pl.altkom.moto.crm.model.Product;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/jpa-application-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class InvoiceDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private InvoiceDAO invoiceDAO;
    
    @Autowired
    private ProductDao productDao;

//    @Test
//    public void testFind() {
//        
//        Invoice invoice = invoiceDAO.findOne(1);
//        
//        System.out.println(invoice);
//    }
//
//    /**
//     * Test of findOne method, of class ClientDAOImpl.
//     */
//    @Test
//    public void testFindOne() {
//        System.out.println("findOne");
//        clientDAO.findOne(1L);
//    }

    /**
     * Test of save method, of class ClientDAOImpl.
     */
    @Test
    public void testSave() {

        System.out.println("save");
        
        Product p = new Product();
        productDao.save(p);
        
        Invoice entity = new Invoice();
        entity.setCreationDate(new Date());
        entity.setFinalizationDate(new Date());
        
        
        
        InviceItem i = new InviceItem();
        i.setInvoice(entity);
        i.setPrice(11);
        i.setProduct(p);
        
        entity.getProducts().add(i);
        
        
        invoiceDAO.save(entity);
        

    }
    
    @Test
    public void testUpdate() {
        
        Invoice i = invoiceDAO.findOne(1L);
        
    }
    
    @Test
    public void testPageable(){
        final Page<Invoice> invoiceNumbers = invoiceDAO
                .findByInvoiceNumber("FVFV3232323", 
                        new PageRequest(0, 5, new Sort(Sort.Direction.ASC, "creationDate")));
        
        for(Invoice invoice : invoiceNumbers){
            System.out.println(invoice);
        }
        
    }

}
