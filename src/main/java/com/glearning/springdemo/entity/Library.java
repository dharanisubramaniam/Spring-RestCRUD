package com.glearning.springdemo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//using lombok instead of boilerplate code
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Library {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String commaSeperatedBookNames;

}
