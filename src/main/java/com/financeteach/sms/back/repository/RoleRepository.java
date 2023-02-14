package com.financeteach.sms.back.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeteach.sms.back.model.ERole;
import com.financeteach.sms.back.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByName(ERole name);
	
}
