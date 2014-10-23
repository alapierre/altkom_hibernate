/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.moto.crm.model.Product;
import pl.altkom.moto.crm.model.ProductAvailability;

/**
 *
 * @author Administrator
 */
public interface Storage extends JpaRepository<ProductAvailability, Long> {

    ProductAvailability findByProduct(Product product);
}
