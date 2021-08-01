package Ib.IbProjectShell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Ib.IbProjectShell.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

	Authority findByName(String name);
}
