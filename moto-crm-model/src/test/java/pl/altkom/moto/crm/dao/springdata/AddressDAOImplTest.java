/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.springdata;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.moto.crm.model.Address;

@ContextConfiguration("/jpa-applicationContext.xml")
@TransactionConfiguration(defaultRollback = false)
public class AddressDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private AddressDAO addressDAO;
    
    @Test
    public void testFindOne() {
        System.out.println("findOne");
        addressDAO.findOne(1L);
    }
    
    @Test
    public void testSave(){
        System.out.println("save");
        Address address = new Address();
        address.setCity("Krakow");
        address.setPostCode("30-000");
        address.setStreet("Mickiewicza 1");
        
        addressDAO.save(address);
    }
    
}
