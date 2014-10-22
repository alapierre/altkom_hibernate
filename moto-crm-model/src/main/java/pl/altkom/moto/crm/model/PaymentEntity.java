/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class PaymentEntity extends BaseEntity {

    private double cost;
    private Date incomeDate;
    private PaymentType paymentType;
    private PaymentForm paymentForm;
    private SettlementEntity settlement;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

    public SettlementEntity getSettlement() {
        return settlement;
    }

    public void setSettlement(SettlementEntity settlement) {
        this.settlement = settlement;
    }
    
    
}
