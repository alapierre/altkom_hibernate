package pl.altkom.moto.crm.dao.springdata;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.Assert;
import pl.altkom.moto.crm.model.User;

@ContextConfiguration("/jpa-application-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class UserDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserDAO userDAO;
    private final String login = "login";


    private void addUser() {
        User user = new User();
        user.setLogin(login);
        user.setPassword("password");
        user.setActive(true);
        userDAO.saveAndFlush(user);
    }

    @Test
    public void testFindById() throws Exception {
        userDAO.deleteAll();
        addUser();
        User byLogin = userDAO.findByLogin(login);
        Assert.notNull(byLogin);
        Assert.isTrue(byLogin.getLogin().equals(login));
        userDAO.deleteByLogin(login);
        User deletedByLogin = userDAO.findByLogin(login);
        Assert.isNull(deletedByLogin);

    }

    @Test
    public void testPagable() throws Exception {
        addUser();
        addUser();
        addUser();
        addUser();
        Page<User> userPage = userDAO.findByLogin(login, new PageRequest(1, 2));
        Assert.isTrue(userPage.getContent().size() == 2);


    }
}
