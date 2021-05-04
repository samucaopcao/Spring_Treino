package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.entities.Rule;

public class RuleDTO implements Serializable {

	/**
	 * Classe responsável por se comunicar com a model Rule
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String authority;

	public RuleDTO() {
		super();
	}

	public RuleDTO(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public RuleDTO(Rule rule) {
		super();
		this.id = rule.getId();
		this.authority = rule.getAuthority();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
