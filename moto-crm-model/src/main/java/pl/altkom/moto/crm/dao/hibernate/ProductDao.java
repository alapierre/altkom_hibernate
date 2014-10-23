package pl.altkom.moto.crm.dao.hibernate;

import pl.altkom.moto.crm.model.Product;

/**
 *
 * @author Administrator
 */
public interface ProductDao {

    Product find(Long id);
    
}
