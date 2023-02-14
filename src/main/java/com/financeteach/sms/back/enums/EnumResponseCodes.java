package com.financeteach.sms.back.enums;

public enum EnumResponseCodes {
	
	SUCCESS (0, "Success"),
	ERROR (99, "ERROR");
	
	private Integer codigo;
	private String descripcion;
	
	private EnumResponseCodes(Integer codigo, String descripcion) {
		// TODO Auto-generated constructor stub
		this.codigo=codigo;
		this.descripcion=descripcion;
	}
	
	public Integer getCodigo() {
		return this.codigo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

}
