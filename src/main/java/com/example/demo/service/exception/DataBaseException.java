package com.example.demo.service.exception;

public class DataBaseException extends RuntimeException {

	/**
	 * Classe responsável por excessões no BD
	 */
	private static final long serialVersionUID = 1L;

	public DataBaseException(String msg) {
		super(msg);
	}

}
