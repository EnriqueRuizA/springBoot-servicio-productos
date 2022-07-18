package com.enrique.service.models.service;

import java.util.List;

import com.enrique.service.models.Producto;

public interface IProductoService {
	
	List<Producto> findAll();
	Producto findById (Long id);
}
