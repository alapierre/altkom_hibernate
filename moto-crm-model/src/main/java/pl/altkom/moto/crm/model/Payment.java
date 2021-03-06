/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.model;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Administrator
 */
@Entity
public class Payment extends BaseEntity {

    private double price;
    private Date incomeDate;
    private PaymentType paymentType;
    private PaymentForm paymentForm;
    
    @OneToMany
    private Collection<Settlement> settlement;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public PaymentForm getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(PaymentForm paymentForm) {
        this.paymentForm = paymentForm;
    }

    public Collection<Settlement> getSettlement() {
        return settlement;
    }

    public void setSettlement(Collection<Settlement> settlement) {
        this.settlement = settlement;
    }
  
    
}
