package com.allane.challenge.customer.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	private String firstName;
	private String lastName;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd.MM.yyyy")
	private LocalDate birthDate;
}
