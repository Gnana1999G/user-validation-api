package com.itsaga.validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
	@NotBlank(message="Name is required")
	private String name;
	@Email(message="Invalid Email format")
	@NotBlank(message="Email is required")
	private String email;
	@Size(min = 6,message="password must be atleast 6 characters")
	private String password;
	@Min(value = 18,message="age must be atleast 18")
	private int age;
}
