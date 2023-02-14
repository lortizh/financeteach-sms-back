package com.financeteach.sms.back.services.impl;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.financeteach.sms.back.enums.EnumResponseCodes;
import com.financeteach.sms.back.exception.ResourceNotFoundException;
import com.financeteach.sms.back.model.Movement;
import com.financeteach.sms.back.payload.response.ResponseHandler;
import com.financeteach.sms.back.repository.MovementRepository;
import com.financeteach.sms.back.services.MovementService;

@Service
public class MovementServiceImpl implements MovementService {

	@Autowired
	private MovementRepository movementRepository;
	private static final Logger logger = LoggerFactory.getLogger(MovementServiceImpl.class);
	private EnumResponseCodes enumResponseCodes;

	@Override
	public List<Movement> getMovements() {
		// TODO Auto-generated method stub
		logger.info("::::> MovementServiceImpl <::::");
		logger.info("	::::> getMovements");
		return movementRepository.findAll();
	}

	@Override
	public ResponseEntity<Movement> getMovementById(Long idMovement) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		logger.info("::::> MovementServiceImpl <::::");
		logger.info("	::::> getMovementById");
		Movement movement;
		// optMovement= movementRepository.findById(idMovement).orElseThrow(() -> new
		// ResourceNotFoundException("Movement not found for this id :: " +
		// idMovement));
		movement = movementRepository.findById(idMovement)
				.orElseThrow(() -> new ResourceNotFoundException("Movement :: " + idMovement + " no encontrado!"));
		// return ResponseEntity.ok().body(optMovement.get());
		return ResponseEntity.ok().body(movement);
	}

	@Override
	public ResponseEntity<List<Movement>> getMovementByIdUser(Long idUser) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		logger.info("::::> MovementServiceImpl <::::");
		logger.info("	::::> getMovementByIdUser");
		List<Movement> movement;
		movement = movementRepository.getMovementByIdUser(idUser);
		if(movement.isEmpty())
			throw new ResourceNotFoundException("No se encuentran movivimientos para el usuario:: " + idUser);
		return ResponseEntity.ok().body(movement);
	}

	@Override
	public ResponseEntity<Object> saveMovement(Movement request) {
		// TODO Auto-generated method stub
		logger.info("::::> MovementServiceImpl <::::");
		logger.info("	::::> saveMovement");
		logger.info("Id User	::::> " + request.getidUser());
		logger.info("Bank	::::> " + request.getbank());
		logger.info("Movement Source	::::> " + request.getmovementSource());
		Movement movement = new Movement();
		movement.setidUser(request.getidUser());
		movement.setbank(request.getbank());
		movement.setmovementSource(request.getmovementSource());
		movement.setmovementDestiny(request.getmovementDestiny());
		movement.setmovementDate(request.getmovementDate());
		movement.setmovementWay(request.getmovementWay());
		movement.setmovementType(request.getmovementType());
		movement.setInOut(request.getInOut());
		movement.setmovementValue(request.getmovementValue());
		movementRepository.save(movement);
		return ResponseHandler.generateResponse(enumResponseCodes.SUCCESS.getDescripcion(),
				enumResponseCodes.SUCCESS.getCodigo(), HttpStatus.CREATED);
	}

}
