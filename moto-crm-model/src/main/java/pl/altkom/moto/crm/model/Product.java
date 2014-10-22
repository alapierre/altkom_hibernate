package pl.altkom.moto.crm.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

/**
 *
 * @author Administrator
 */
@Entity
public class Product extends BaseEntity {
    @Column(name = "ean_number")
    private String eanNumber;
    private String description;
    
    @OneToOne
    @JoinColumns(@JoinColumn(name = "product_group_id", referencedColumnName = "id"))
    private ProductGroup productGroup;
    
    private transient Set<Integer> compatibleProducts;

    public String getEanNumber() {
        return eanNumber;
    }

    public void setEanNumber(String eanNumber) {
        this.eanNumber = eanNumber;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public Set<Integer> getCompatibleProducts() {
        return compatibleProducts;
    }

    public void setCompatibleProducts(Set<Integer> compatibleProducts) {
        this.compatibleProducts = compatibleProducts;
    }
    
    
}
