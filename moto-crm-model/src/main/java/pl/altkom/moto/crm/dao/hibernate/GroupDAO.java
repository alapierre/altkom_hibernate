/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.moto.crm.dao.hibernate;

import pl.altkom.moto.crm.model.Group;

/**
 *
 * @author Administrator
 */
public interface GroupDAO {

    public Group findOne(long id);

    public void save(Group entity);
    
    public void flush();
}
