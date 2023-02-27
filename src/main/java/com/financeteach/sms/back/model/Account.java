package com.financeteach.sms.back.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name = "account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	// Agregar user id
	
	@Column(name = "account_status")
	private boolean accountStatus;
	
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;
	
	@Column(name = "account_name")
	private String accountName;
	
	@Column(name = "account_balance")
	private double accountBalance;
	
	@Column(name = "account_type")
	private String accountType;
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "movement")
    private List movements;
	*/
	
}
