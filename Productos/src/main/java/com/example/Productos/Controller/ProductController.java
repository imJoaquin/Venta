package com.example.Productos.Controller;

import com.example.Productos.Entity.Producto;
import com.example.Productos.Services.ProductoServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/Products")
public class ProductController {

    @Autowired
    private final ProductoServicios productoServicios;

    public ProductController(ProductoServicios productoServicios) {
        this.productoServicios = productoServicios;
    }

    @GetMapping("{idProducto}")
    public Optional<Producto> getById(@PathVariable("idProducto") Integer id){
        return productoServicios.getProduct(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Producto producto){
        productoServicios.saveOrUpdate(producto);
    }

    @GetMapping
    public Optional<Producto> getProducto(Integer id){
        return productoServicios.getProduct(id);
    }

    @DeleteMapping("{idProducto}")
    public void deleteProducto(@PathVariable("idProducto") Integer id){
        productoServicios.detele(id);
    }
}
