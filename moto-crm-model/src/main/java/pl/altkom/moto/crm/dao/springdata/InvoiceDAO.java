/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.springdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import pl.altkom.moto.crm.model.Invoice;

/**
 *
 * @author Administrator
 */
public interface InvoiceDAO extends JpaRepository<Invoice, Long>,
        RevisionRepository<Invoice, Long, Integer>{
    
    public Page<Invoice> findByInvoiceNumber(String invoiceNumber, Pageable pageable);
    
}
