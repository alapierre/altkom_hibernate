package pl.altkom.moto.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Address extends BaseEntity {
    
    @NotNull
    private String city;

    @NotNull
    private String street;
    

    @Column(name = "POST_CODE", nullable = false)
    @Pattern(regexp = "^\\d{2}-\\d{3}$")
    private String postCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
