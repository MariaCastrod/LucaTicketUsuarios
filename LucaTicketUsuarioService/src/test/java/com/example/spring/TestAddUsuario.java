package com.example.spring;
import static io.restassured.RestAssured.given;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class TestAddUsuario {

	private static final Logger logger = Logger.getLogger("TestAddUsuario.class");
	
	@Test
 	public void postRequest() {

		logger.info("---- Se ha invocado el TestAddUsuario");
		
		given()
	 		.port(2222)
	 		.header("Content-type", "application/json")
	 		.and()
	 		.body("{\"nombre\":\"Luis\", \"apellido\":\"Ramirez\", \"mail\":\"raez@gmail.com\", \"contrasenia\":\"oefa\" }")
	 	.when()
	 		.post("/usuarios/add")
	 	.then().log().all()
	 		.statusCode(201);
 	}
}