package com.example.Ventas.Services;

import com.example.Ventas.Entity.Detalle;
import com.example.Ventas.Repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleService {

    @Autowired
    DetalleRepository detalleRepository;

    public List<Detalle> getAll(){
        return detalleRepository.findAll();
    }

    public Optional<Detalle> getDetalle(Integer id){
        return detalleRepository.findById(id);
    }

    public void  saveOrUpdate(Detalle detalle){
        detalleRepository.save(detalle);
    }

    public void detele(Integer id){
        detalleRepository.deleteById(id);
    }
}
