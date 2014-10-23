package pl.altkom.moto.crm.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.altkom.moto.crm.model.Product;

/**
 *
 * @author Administrator
 */
@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Product find(Long id) {
        return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
    }

    @Override
    public void save(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }
}
