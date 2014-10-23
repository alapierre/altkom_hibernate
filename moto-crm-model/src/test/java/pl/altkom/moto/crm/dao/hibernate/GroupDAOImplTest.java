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
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.moto.crm.model.Group;

import junit.framework.Assert;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/session-factory-applicationContext.xml")
@TransactionConfiguration(defaultRollback = false)
public class GroupDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private GroupDAO groupDAO;

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
        final Group group = buildGroup();
        groupDAO.save(group);
        final Long id = group.getId();
        groupDAO.flush();
        final Group found = groupDAO.findOne(id);
        Assert.assertEquals(found.getName(), group.getName());

    }

    private Group buildGroup() {
        final Group group = new Group();
        group.setName("group1");
        group.setActive("false");
        group.setDescription("elaborate description");
        return group;
    }

}
