package pl.altkom.moto.crm.model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

/**
 *
 * @author Administrator
 */
@Entity
@Audited
public class Product extends BaseEntity {
    @Column(name = "ean_number")
    private String eanNumber;
    private String description;
    
    @OneToOne
    @JoinColumns(@JoinColumn(name = "product_group_id", referencedColumnName = "id"))
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private ProductGroup productGroup;
    
    private transient Collection<Product> compatibleProducts;

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

    public Collection<Product> getCompatibleProducts() {
        return compatibleProducts;
    }

    public void setCompatibleProducts(Collection<Product> compatibleProducts) {
        this.compatibleProducts = compatibleProducts;
    }


    
}
