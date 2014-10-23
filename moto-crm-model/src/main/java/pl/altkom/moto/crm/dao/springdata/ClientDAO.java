/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.moto.crm.dao.springdata;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.moto.crm.model.Client;

/**
 *
 * @author Administrator
 */
public interface ClientDAO extends JpaRepository<Client, Long>{
    
    public List<Client> findByNameLikeIgnoreCaseAndEmail(String name, String email);
    
}
