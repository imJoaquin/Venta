package com.example.Ventas.Controller;

import com.example.Ventas.Entity.Venta;
import com.example.Ventas.Services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/ventas")
public class VentaController {

    @Autowired
    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping("{idVenta}")
    public Optional<Venta> getById(@PathVariable("idVenta") Integer id){
        return ventaService.getVenta(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Venta venta){
        ventaService.saveOrUpdate(venta);
    }

    @GetMapping
    public Optional<Venta> getVenta(Integer id){
        return ventaService.getVenta(id);
    }

    @DeleteMapping("{idVenta}")
    public void deleteVenta(@PathVariable("idVenta") Integer id){
        ventaService.detele(id);
    }
}
