/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Administrator
 */
@Entity
public class Group extends BaseEntity {

    @Column
    private String name;
    @Column(name = "desc")
    private String description;
    @Column
    private String code;
    @Column
    private String active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

}
