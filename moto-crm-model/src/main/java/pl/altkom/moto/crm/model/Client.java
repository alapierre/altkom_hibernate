/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Administrator
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
@Audited
public class Client extends BaseEntity {
    
    @Size(max = 128)
    @NotEmpty
    private String name;

    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", email=" + email + '}';
    }
    
    
}
