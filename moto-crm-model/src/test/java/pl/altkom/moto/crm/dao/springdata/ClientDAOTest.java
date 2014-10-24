/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.springdata;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.moto.crm.dao.hibernate.*;
import pl.altkom.moto.crm.model.Client;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/jpa-application-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class ClientDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ClientDAO clientDAO;

    @Test
    public void testFind() {
        
        List<Client> res = clientDAO.findByNameLikeIgnoreCaseAndEmail("ala", "adrian@soft-project.pl");
        
        System.out.println(res);
    }

    @Test
    public void testFindWithPage() {
        
        Page<Client> page = clientDAO.findByNameLikeIgnoreCaseAndEmail("adrian", 
                "adrian@soft-project.pl", new PageRequest(1, 5, new Sort(Sort.Direction.ASC, "name")));
        
        System.out.println("ilosc rekordow " + page.getTotalElements());
        
        for(Client c : page) {
            System.out.println(c);
        }
        
    }
    
    @Test
    public void testFindAllWithPage() {
        
        Page<Client> page = clientDAO.findAllClients(
                new PageRequest(0, 5, new Sort(Sort.Direction.ASC, "name")));
        
        System.out.println("ilosc rekordow " + page.getTotalElements());
        
        for(Client c : page) {
            System.out.println(c);
        }
        
    }
    
    @Test
    public void testFindTop100() {
        
        List<Client> res = clientDAO.findTop100ByName("a");
        
        System.out.println(res);
    }
    
    /**
     * Test of findOne method, of class ClientDAOImpl.
     */
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        clientDAO.findOne(1L);
    }

    /**
     * Test of save method, of class ClientDAOImpl.
     */
    @Test
    public void testSave() {

        System.out.println("save");
        
        Client entity = new Client();
        entity.setEmail("adrian@soft-project.pl");
        entity.setName("adrian");
        clientDAO.save(entity);
        
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
