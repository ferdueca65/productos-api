package com.misiontic.productosapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {
	
	@GetMapping(value="metodo-saludar")
	public String saludar() {
		return "<marquee style='margin-left:4px' bgcolor='blue' behavior='alternate' direction='right' style='margin-left=300px'><font color='white' size='8'><margin left='200px'>Hola cómo estás, FERNANDO DUEÑAS CACUA</margin></font></marquee>"
				;
	}
}
