package com.financeteach.sms.back.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.financeteach.sms.back.exception.ResourceNotFoundException;
import com.financeteach.sms.back.model.Movement;

public interface MovementService {
	
	public List<Movement> getMovements();
	
	public ResponseEntity<Movement> getMovementById(@PathVariable(value = "id") Long idMovement) throws ResourceNotFoundException;
	
	public ResponseEntity <List<Movement>> getMovementByIdUser(@PathVariable(value = "iduser") Long idMovement) throws ResourceNotFoundException;
	
	public ResponseEntity<Object> saveMovement(@RequestBody Movement request);
	
}
