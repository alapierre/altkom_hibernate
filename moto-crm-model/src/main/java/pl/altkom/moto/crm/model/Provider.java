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
class Provider extends BaseEntity{
    private String company;
    private PaymentEntity payment;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PaymentEntity getPrice() {
        return payment;
    }

    public void setPrice(PaymentEntity price) {
        this.payment = price;
    }
}
