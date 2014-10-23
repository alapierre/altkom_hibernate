/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.hibernate;

import pl.altkom.moto.crm.model.Client;
import pl.altkom.moto.crm.model.Invoice;

/**
 *
 * @author Administrator
 */
public interface InvoiceDao {
    Invoice findOne(long id);

    void save(Invoice entity);
}
