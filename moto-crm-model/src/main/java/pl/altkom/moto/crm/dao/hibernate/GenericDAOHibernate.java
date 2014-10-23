/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.hibernate;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
interface GenericDAOHibernate<T, PK extends Serializable> {
    
    public T findOne(PK id);
    
    public T load(PK id);
    
    public void save(T entity);
    
    public Iterable<T> findAll();
    
    public void delete(T entity);
}
