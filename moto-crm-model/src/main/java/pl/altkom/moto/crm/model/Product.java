package pl.altkom.moto.crm.model;

import java.util.Set;

/**
 *
 * @author Administrator
 */
public class Product extends BaseEntity {
    private String eanNumber;
    private String description;
    private ProductGroup productGroup;
    private Set<Integer> compatibleProducts;

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
