package com.financeteach.sms.back.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movement")
public class Movement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "id_user")
	private long idUser;

	@Column(name = "bank")
	private String bank;

	@Column(name = "movement_source")
	private String movementSource;

	@Column(name = "movement_destiny")
	private String movementDestiny;

	// @Column(name = "movement_date")
	// private Timestamp movementDate;
	@Column(name = "movement_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime movementDate;

	@Column(name = "movement_way")
	private String movementWay;

	@Column(name = "movement_type")
	private String movementType;

	@Column(name = "in_out")
	private String inOut;

	@Column(name = "movement_value")
	private double movementValue;

	public Movement() {
		// TODO Auto-generated constructor stub
	}

	public Movement(long idUser, String bank, String movementSource, String movementDestiny, LocalDateTime movementDate,
			String movementWay, String movementType, String inOut, double movementValue) {
		this.idUser = idUser;
		this.bank = bank;
		this.movementSource = movementSource;
		this.movementDestiny = movementDestiny;
		this.movementDate = movementDate;
		this.movementWay = movementWay;
		this.movementType = movementType;
		this.inOut = inOut;
		this.movementValue = movementValue;
	}

	public long getidUser() {
		return idUser;
	}

	public void setidUser(long idUser) {
		this.idUser = idUser;
	}

	public String getbank() {
		return bank;
	}

	public void setbank(String bank) {
		this.bank = bank;
	}

	public String getmovementSource() {
		return movementSource;
	}

	public void setmovementSource(String movementSource) {
		this.movementSource = movementSource;
	}

	public String getmovementDestiny() {
		return movementDestiny;
	}

	public void setmovementDestiny(String movementDestiny) {
		this.movementDestiny = movementDestiny;
	}

	public LocalDateTime getmovementDate() {
		return movementDate;
	}

	// ************ //
	public void setmovementDate(LocalDateTime movementDate) {
		this.movementDate = movementDate;
	}

	public String getmovementWay() {
		return movementWay;
	}

	public void setmovementWay(String movementWay) {
		this.movementWay = movementWay;
	}

	public String getmovementType() {
		return movementType;
	}

	public void setmovementType(String movementType) {
		this.movementType = movementType;
	}

	public String getInOut() {
		return inOut;
	}

	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public double getmovementValue() {
		return movementValue;
	}

	public void setmovementValue(double movementValue) {
		this.movementValue = movementValue;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Movement [id=" + id + ", idUser=" + idUser + ", bank=" + bank + ", movementSource=" + movementSource
				+ ", movementDestiny=" + movementDestiny + ", movementDate=" + movementDate + ", movementWay="
				+ movementWay + ", movementType=" + movementType + ", inOut=" + inOut + ", movementValue="
				+ movementValue + "]";
	}
}
