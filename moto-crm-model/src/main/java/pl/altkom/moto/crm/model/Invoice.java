/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.envers.Audited;
import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

/**
 *
 * @author Administrator
 */
@Entity
@Audited
public class Invoice extends BaseEntity {

    private String invoiceNumber;

    @OneToMany(mappedBy = "invoice" ,cascade = CascadeType.ALL)
    
    private List<InviceItem> products = new ArrayList<>();
    
    
    @OneToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
    
//    private Resealer resealer;

    private Date creationDate;
    private Date finalizationDate;
    private PaymentType paymentType;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getFinalizationDate() {
        return finalizationDate;
    }

    public void setFinalizationDate(Date finalizationDate) {
        this.finalizationDate = finalizationDate;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceNumber=" + invoiceNumber + ", products=" + products + ", client=" + client + ", creationDate=" + creationDate + ", finalizationDate=" + finalizationDate + ", paymentType=" + paymentType + '}';
    }

    public List<InviceItem> getProducts() {
        return products;
    }
    
    

}
