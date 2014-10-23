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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.moto.crm.dao.hibernate.*;
import pl.altkom.moto.crm.model.Client;
import pl.altkom.moto.crm.model.Invoice;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/jpa-application-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class InvoiceDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private InvoiceDAO invoiceDAO;

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
        
        Invoice entity = new Invoice();
        entity.setCreationDate(new Date());
        entity.setFinalizationDate(new Date());
        invoiceDAO.save(entity);
        
//        transactionTemplate.execute(new TransactionCallback() {
//
//            @Override
//            public Object doInTransaction(TransactionStatus status) {
//                
//
//                
//                return null;
//            }
//        });

        

    }

}
