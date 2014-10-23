package pl.altkom.moto.crm.dao.hibernate;

import pl.altkom.moto.crm.model.Client;
import pl.altkom.moto.crm.model.Delivery;

public interface DeliveryDao {
    Delivery findOne(long id);
    void save(Delivery entity);
}
