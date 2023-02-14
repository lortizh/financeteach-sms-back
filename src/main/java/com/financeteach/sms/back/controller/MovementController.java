package com.financeteach.sms.back.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeteach.sms.back.model.Movement;
import com.financeteach.sms.back.services.MovementService;
import com.financeteach.sms.back.services.impl.MovementServiceImpl;
import com.financeteach.sms.back.exception.ResourceNotFoundException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/financeteach")
public class MovementController {

	@Autowired
	private MovementService movementService;
	
	private static final Logger logger = LoggerFactory.getLogger(MovementServiceImpl.class);	

	@GetMapping("/movements")
	@PreAuthorize("hasRole('USER')")
	public List<Movement> getMovements() {
		logger.info("::::> MovementController <::::");
		logger.info("	::::> getMovements");
		return movementService.getMovements();
	}

	@GetMapping("/movements/{id}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<Movement> getMovementById(@PathVariable(value = "id") Long idMovement)
			throws ResourceNotFoundException {
		logger.info("::::> MovementController <::::");
		logger.info("	::::> getMovementById");
		return movementService.getMovementById(idMovement);
	}
	
	@GetMapping("/movements/user/{iduser}")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity <List<Movement>> getMovementByIdUser(@PathVariable(value = "iduser") Long idUser)
			throws ResourceNotFoundException {
		logger.info("::::> MovementController <::::");
		logger.info("	::::> getMovementByIdUser");
		return movementService.getMovementByIdUser(idUser);
	}
	
	@PostMapping("/movements")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<Object> saveMovement(@RequestBody Movement request) {
		logger.info("::::> MovementController <::::");
		logger.info("	::::> saveMovement");		
		return movementService.saveMovement(request);
	}

}
