/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Client extends BaseEntity {
    
    @Size(max = 128)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
