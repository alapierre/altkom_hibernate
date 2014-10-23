/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.hibernate;

import java.util.Date;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import pl.altkom.moto.crm.model.Client;
import pl.altkom.moto.crm.model.Invoice;
import pl.altkom.moto.crm.model.PaymentType;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/session-factory-applicationContext.xml")
@TransactionConfiguration(defaultRollback = false)
public class InvoiceDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * Test of findOne method, of class ClientDAOImpl.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");

    }

    /**
     * Test of save method, of class ClientDAOImpl.
     */
    @Test
    public void testSave() {

        System.out.println("save");
        
        Invoice entity = new Invoice();
        entity.setCreationDate(new Date());
        entity.setFinalizationDate(new Date());
        entity.setInvoiceNumber("FVFV3232323");
        entity.setPaymentType(PaymentType.PARTIAL);
        invoiceDao.save(entity);
    }

}
