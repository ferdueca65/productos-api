package com.misiontic.productosapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.productosapi.entity.Producto;
import com.misiontic.productosapi.repository.ProductoRepository;
import com.misiontic.productosapi.validators.ProductoValidator;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepo;

	public Producto findById(Long productoId) {
		Producto objProducto = productoRepo.findById(productoId)
				.orElseThrow(() -> new RuntimeException("No existe el producto."));
		return objProducto;
	}
    
	@Transactional
	public void delete(Long productoId) {
		Producto objProducto = productoRepo.findById(productoId)
				.orElseThrow(() -> new RuntimeException("No existe el producto."));

		productoRepo.delete(objProducto);
	}

	public List<Producto> findAll() {
		List<Producto> productos = productoRepo.findAll();
		return productos;
	}

	@Transactional
	public Producto create(Producto producto) {
		ProductoValidator.save(producto);
		Producto nuevoProducto = productoRepo.save(producto);
		return nuevoProducto;
	}

	@Transactional
	public Producto update(Producto producto) {
		Producto existeProducto = productoRepo.findById(producto.getId())
				.orElseThrow(() -> new RuntimeException("No existe el producto."));
		
		existeProducto.setNombre(producto.getNombre());
		productoRepo.save(existeProducto);
		return existeProducto;
	}
}
