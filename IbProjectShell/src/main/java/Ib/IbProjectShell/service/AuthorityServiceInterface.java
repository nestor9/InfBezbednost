package Ib.IbProjectShell.service;

import java.util.List;

import Ib.IbProjectShell.model.Authority;

public interface AuthorityServiceInterface {

	List<Authority> findById(Long id);
	List<Authority> findByname(String name);
	
}
