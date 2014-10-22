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
class Settlement extends BaseEntity {

    private Invoice invoice;
    private Client client;
    private double net;
    private Date finalizationDate;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public Date getFinalizationDate() {
        return finalizationDate;
    }

    public void setFinalizationDate(Date finalizationDate) {
        this.finalizationDate = finalizationDate;
    }
    
    
}
