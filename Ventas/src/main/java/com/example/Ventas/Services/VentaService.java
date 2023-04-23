package com.example.Ventas.Services;

import com.example.Ventas.Entity.Venta;
import com.example.Ventas.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    public List<Venta> getAll(){
        return ventaRepository.findAll();
    }

    public Optional<Venta> getVenta(Integer id){
        return ventaRepository.findById(id);
    }

    public void  saveOrUpdate(Venta venta){
        ventaRepository.save(venta);
    }

    public void detele(Integer id){
        ventaRepository.deleteById(id);
    }
}
