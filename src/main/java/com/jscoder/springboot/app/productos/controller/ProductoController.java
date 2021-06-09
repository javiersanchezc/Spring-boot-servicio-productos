package com.jscoder.springboot.app.productos.controller;

import com.jscoder.springboot.app.productos.models.entity.Producto;
import com.jscoder.springboot.app.productos.models.service.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IproductoService iproductoService;
@GetMapping("/listar")
    public List<Producto> listar(){
        return iproductoService.findAll();

    }
    @GetMapping("/listar{id}")
    public  Producto detalle(@PathVariable Long id){
    return  iproductoService.findById(id);

    }

}
