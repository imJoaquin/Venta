package com.example.Productos.Services;

import com.example.Productos.Entity.UnidadDeMedida;
import com.example.Productos.Repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaServices {

    @Autowired
    UnidadMedidaRepository unidadMedidaRepository;

    public List<UnidadDeMedida> getAll(){
        return unidadMedidaRepository.findAll();
    }

    public Optional<UnidadDeMedida> getUnidad(Integer id){
        return unidadMedidaRepository.findById(id);
    }

    public void  saveOrUpdate(UnidadDeMedida unidadDeMedida){
        unidadMedidaRepository.save(unidadDeMedida);
    }

    public void detele(Integer id){
        unidadMedidaRepository.deleteById(id);
    }
}
