package com.example.Productos.Services;

import com.example.Productos.Entity.Producto;
import com.example.Productos.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicios {

    @Autowired
    ProductRepository productRepository;

    public List<Producto> getAll(){
        return productRepository.findAll();
    }

    public Optional<Producto> getProduct(Integer id){
        return productRepository.findById(id);
    }

    public void  saveOrUpdate(Producto producto){
        productRepository.save(producto);
    }

    public void detele(Integer id){
        productRepository.deleteById(id);
    }
}
