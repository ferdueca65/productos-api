package com.misiontic.productosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misiontic.productosapi.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
