package pl.altkom.moto.crm.model;

import java.util.Date;

/**
 *
 * @author DeLong
 */
public class Delivery extends BaseEntity{
    private Client client;
    private Provider provider;
    private User user;
    private Date shippingTime;
    private Date obtainTime;
    private Boolean deliveryAck;
    private Order order;
    private Address address;
    private String recipient;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Date getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(Date obtainTime) {
        this.obtainTime = obtainTime;
    }

    public Boolean isDeliveryAck() {
        return deliveryAck;
    }

    public void setDeliveryAck(Boolean deliveryAck) {
        this.deliveryAck = deliveryAck;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
 
    
}
