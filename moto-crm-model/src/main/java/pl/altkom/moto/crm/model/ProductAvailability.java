/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.model;

/**
 *
 * @author Administrator
 */
public class ProductAvailability {
    private Product product;
    private long quantity;
    private long minimalQuantity;
    private long maximalQuantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(long minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    public long getMaximalQuantity() {
        return maximalQuantity;
    }

    public void setMaximalQuantity(long maximalQuantity) {
        this.maximalQuantity = maximalQuantity;
    }
}
