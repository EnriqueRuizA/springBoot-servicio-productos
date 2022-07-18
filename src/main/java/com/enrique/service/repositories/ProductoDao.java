package com.enrique.service.repositories;

import org.springframework.data.repository.CrudRepository;

import com.enrique.service.models.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
