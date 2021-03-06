/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.springdata;


import java.util.List;
import javax.persistence.QueryHint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;
import pl.altkom.moto.crm.model.Client;

/**
 *
 * @author Administrator
 */
public interface ClientDAO extends JpaRepository<Client, Long>, 
        PagingAndSortingRepository<Client, Long>, RevisionRepository<Client, Long, Integer> {
    
    public List<Client> findTop100ByName(String name);
    
    public List<Client> findByNameLikeIgnoreCaseAndEmail(String name, 
            String email);
    
    public Page<Client> findByNameLikeIgnoreCaseAndEmail(String name, 
            String email, Pageable pageable);
    
    @Query("select c from Client c")
    @QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
    public Page<Client> findAllClients(Pageable pageable);
    
    
    
}
