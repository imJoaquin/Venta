package com.example.Clientes.Controller;

import com.example.Clientes.Entity.Cliente;
import com.example.Clientes.Services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clientes")
public class ClienteController {

    @Autowired
    private final ClienteServices clienteServices;

    public ClienteController(ClienteServices clienteServices) {
        this.clienteServices = clienteServices;
    }

    @GetMapping("{idCliente}")
    public Optional<Cliente> getById(@PathVariable("idCliente") Integer id){
        return clienteServices.getClient(id);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Cliente cliente){
        clienteServices.saveOrUpdate(cliente);
    }

    @GetMapping
    public Optional<Cliente> getCliente(Integer id){
        return clienteServices.getClient(id);
    }

    @DeleteMapping("{idCliente}")
    public void deleteCliente(@PathVariable("idCliente") Integer id){
        clienteServices.detele(id);
    }
}
