package pl.altkom.moto.crm.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.moto.crm.model.Product;

/**
 *
 * @author Administrator
 */
public interface ProductDao extends JpaRepository<Product, Long> {
    
}
