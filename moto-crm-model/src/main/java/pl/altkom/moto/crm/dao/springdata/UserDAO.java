package pl.altkom.moto.crm.dao.springdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.moto.crm.model.User;

public interface UserDAO extends JpaRepository<User, Long> {

    public User findByLogin(String login);

    public Long deleteByLogin(String login);

    public Page<User> findByLogin(String login, Pageable pageable);
}
