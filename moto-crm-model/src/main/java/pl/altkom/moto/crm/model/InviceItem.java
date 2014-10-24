/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.envers.Audited;
import pl.altkom.moto.crm.model.BaseEntity;
import pl.altkom.moto.crm.model.Invoice;
import pl.altkom.moto.crm.model.Product;

/**
 *
 * @author Administrator
 */
@Entity
@Audited
public class InviceItem extends BaseEntity {
    
    @ManyToOne()
    @JoinColumn(name = "invoice_ID")
    private Invoice invoice;
    
    @ManyToOne
    @JoinColumn(name = "product_ID")
    private Product product;
    private int volume;
    private double price;
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
    
    
    
}
