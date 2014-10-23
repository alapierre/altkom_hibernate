package pl.altkom.moto.crm.dao.hibernate;

import pl.altkom.moto.crm.model.Provider;

public interface ProviderDao {
    Provider findOne(long id);
    void save(Provider entity);
}
