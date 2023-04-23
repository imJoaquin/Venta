package com.example.Inventario.Controller;

import com.example.Inventario.Entity.Inventario;
import com.example.Inventario.Services.ServicioInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clients")
public class InventarioController {

    @Autowired
    private final ServicioInventario servicioInventario;

    public InventarioController(ServicioInventario servicioInventario) {
        this.servicioInventario = servicioInventario;
    }

    @GetMapping("{idInventario}")
    public Optional<Inventario> getById(@PathVariable("idInventario") Integer id){
        return servicioInventario.getInventario(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Inventario inventario){
        servicioInventario.saveOrUpdate(inventario);
    }

    @GetMapping
    public Optional<Inventario> getInventario(Integer id){
        return servicioInventario.getInventario(id);
    }

    @DeleteMapping("{idInventario}")
    public void deleteInventario(@PathVariable("idInventario") Integer id){
        servicioInventario.detele(id);
    }
}
