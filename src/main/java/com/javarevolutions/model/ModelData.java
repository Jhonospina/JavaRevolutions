package com.javarevolutions.model;

import java.io.Serializable;

public class ModelData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3897269571981938848L;
	private int code;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	private String mensaje;
	private boolean status;

}
