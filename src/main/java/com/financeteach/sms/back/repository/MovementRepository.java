package com.financeteach.sms.back.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeteach.sms.back.model.Movement;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Long> {
	
	List <Movement> getMovementByIdUser(Long idUser);
	
}
