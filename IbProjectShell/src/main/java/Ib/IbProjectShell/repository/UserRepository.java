package Ib.IbProjectShell.repository;

import Ib.IbProjectShell.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail( String email );
    List<User> findByActive(Boolean active);
	
}
