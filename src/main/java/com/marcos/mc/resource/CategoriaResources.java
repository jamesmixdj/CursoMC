package com.marcos.mc.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value= "/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando! O PROGRAMADOR MARCOS É FODA.";
	}

}
