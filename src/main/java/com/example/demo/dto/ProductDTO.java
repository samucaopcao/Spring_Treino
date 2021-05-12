package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

import com.example.demo.entities.Product;
import com.sun.istack.NotNull;

public class ProductDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long Id;

	@NotBlank(message = "Campo obrigatório")
	private String name;

	@NotBlank(message = "Campo obrigatório")
	private String description;

	@NotNull
	private BigDecimal price;

	public ProductDTO() {
		super();
	}

	public ProductDTO(Long id, String name, String description, BigDecimal price) {
		Id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public ProductDTO(Product entity) {
		Id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

}
