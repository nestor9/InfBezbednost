package Ib.IbProjectShell.service;

import java.util.List;

import Ib.IbProjectShell.dto.UserDTO;
import Ib.IbProjectShell.model.User;

public interface UserServiceInterface {

	User findById(Long id);
    User findByEmail(String email);
    List<User> findAll ();
	User save(UserDTO userDTO);
    List<User> findByActive(Boolean active);
    User activateUser(String email);
	
}
