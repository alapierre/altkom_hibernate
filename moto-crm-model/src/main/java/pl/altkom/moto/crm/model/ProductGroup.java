package pl.altkom.moto.crm.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Administrator
 */
@Entity
public class ProductGroup extends BaseEntity {
    private String name;

    @OneToOne()
    @JoinColumn(name = "parent_group_id", referencedColumnName = "id")
    private ProductGroup parentProductGroup;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductGroup getParentProductGroup() {
        return parentProductGroup;
    }

    public void setParentProductGroup(ProductGroup parentProductGroup) {
        this.parentProductGroup = parentProductGroup;
    }
}
