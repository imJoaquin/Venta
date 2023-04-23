package com.example.Clientes.Services;

import com.example.Clientes.Entity.Cliente;
import com.example.Clientes.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClient(Integer id){
        return clienteRepository.findById(id);
    }

    public void saveOrUpdate(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void detele(Integer id){
        clienteRepository.deleteById(id);
    }
}
