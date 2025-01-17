package com.example.spring.model;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class UsuarioDto {
	
	private String nombre;
	private String apellido;
	private String mail;
	private String contrasenia;
	private LocalDateTime fecha_alta;
	private String rol;

}
