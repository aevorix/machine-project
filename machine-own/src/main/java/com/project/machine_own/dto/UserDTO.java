package com.project.machine_own.dto;

import lombok.Data;

@Data
public class UserDTO {
	private Long id;
	private String username;
	private String email;
	private String phone;
	private String role;
}
