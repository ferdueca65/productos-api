package com.misiontic.productosapi.validators;

import com.misiontic.productosapi.entity.Producto;

public class ProductoValidator {
	public static void save(Producto producto) {
		if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
			throw new RuntimeException("El nombre es requerido");
		}
		
		if (producto.getNombre().length() > 100) {	
				throw new RuntimeException("El nombre del producto es muy largo max 100 caracteres");
		}
	}

}
