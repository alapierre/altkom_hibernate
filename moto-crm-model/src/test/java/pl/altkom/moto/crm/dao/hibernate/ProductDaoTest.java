package pl.altkom.moto.crm.dao.hibernate;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author Administrator
 */
@ContextConfiguration("/session-factory-applicationContext.xml")
@TransactionConfiguration(defaultRollback = false)
public class ProductDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private ProductDao productDao;
    
    @Test
    public void testFindOne() {
        productDao.find(5L);
    }
}
