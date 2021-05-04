package com.example.demo.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.example.demo.entities.User;

public class UserDTO implements Serializable {

	/**
	 * Classe responsável por acessar a model USER
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "Campo Obrigatório!")
	private String firstName;

	@NotBlank(message = "Campo Obrigatório!")
	private String lastName;

	@Email(message = "Por favor insira um e-mail válido!")
	private String email;

	private String password;
	Set<RuleDTO> rules = new HashSet<>();

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public UserDTO(User entity) {
		this.id = entity.getId();
		this.firstName = entity.getFirstName();
		this.lastName = entity.getLastName();
		this.email = entity.getEmail();
		//this.password = entity.getPassword();
		entity.getRules().forEach(rule -> this.rules.add(new RuleDTO(rule)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// O set será dado por outra classe de adm por segurança
	public Set<RuleDTO> getRules() {
		return rules;
	}

}
