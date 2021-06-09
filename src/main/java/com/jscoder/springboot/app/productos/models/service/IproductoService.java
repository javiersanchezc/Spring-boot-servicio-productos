package com.jscoder.springboot.app.productos.models.service;

import com.jscoder.springboot.app.productos.models.entity.Producto;

import java.util.List;

public interface IproductoService {

    public List<Producto> findAll();
    public  Producto findById(Long id);




}
