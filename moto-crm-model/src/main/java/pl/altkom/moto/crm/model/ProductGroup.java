package pl.altkom.moto.crm.model;

import javax.persistence.Entity;

/**
 *
 * @author Administrator
 */
@Entity
public class ProductGroup extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
