package com.example.Inventario.Services;

import com.example.Inventario.Entity.Inventario;
import com.example.Inventario.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioInventario {

    @Autowired
    InventarioRepository inventarioRepository;

    public List<Inventario> getAll(){
        return inventarioRepository.findAll();
    }

    public Optional<Inventario> getInventario(Integer id){
        return inventarioRepository.findById(id);
    }

    public void saveOrUpdate(Inventario inventario){
        inventarioRepository.save(inventario);
    }

    public void detele(Integer id){
        inventarioRepository.deleteById(id);
    }

}
