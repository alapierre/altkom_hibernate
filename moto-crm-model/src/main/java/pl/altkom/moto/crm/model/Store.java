/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.model;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Store extends BaseEntity {

    private List<ProductAvailability> productsAvailabilities;

    public List<ProductAvailability> getProductsAvailabilities() {
        return productsAvailabilities;
    }

    public void setProductsAvailabilities(List<ProductAvailability> productsAvailabilities) {
        this.productsAvailabilities = productsAvailabilities;
    }
}
