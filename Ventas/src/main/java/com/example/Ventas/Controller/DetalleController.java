package com.example.Ventas.Controller;

import com.example.Ventas.Entity.Detalle;
import com.example.Ventas.Services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/ventas")
public class DetalleController {

    @Autowired
    private final DetalleService detalleService;

    public DetalleController(DetalleService detalleService) {
        this.detalleService = detalleService;
    }

    @GetMapping("{idDetalle}")
    public Optional<Detalle> getById(@PathVariable("idDetalle") Integer id){
        return detalleService.getDetalle(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Detalle detalle){
        detalleService.saveOrUpdate(detalle);
    }

    @GetMapping
    public Optional<Detalle> getDetalle(Integer id){
        return detalleService.getDetalle(id);
    }

    @DeleteMapping("{idDetalle}")
    public void deleteDetalle(@PathVariable("idDetalle") Integer id){
        detalleService.detele(id);
    }
}
