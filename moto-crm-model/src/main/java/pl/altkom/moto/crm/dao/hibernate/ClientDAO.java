/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.hibernate;

import pl.altkom.moto.crm.model.Client;

/**
 *
 * @author Administrator
 */

public interface ClientDAO {

    Client findOne(Long id);

    void save(Client entity);
    
}
