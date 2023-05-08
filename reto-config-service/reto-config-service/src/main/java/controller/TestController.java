package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${alumno.alumno-nombre}")
	private String myNombre;
	
	@GetMapping(path="/mi-nombre")
	public String myNombre() {
		return this.myNombre;
	}

}
