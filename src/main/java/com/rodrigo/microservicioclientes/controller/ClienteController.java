package com.rodrigo.microservicioclientes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.microservicioclientes.model.Cliente;
import com.rodrigo.microservicioclientes.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController 
{

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) 
    {
        this.clienteService = clienteService;
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) 
    {
        return clienteService.crearCliente(cliente);
    }

    @GetMapping("/kpideclientes")
    public double obtenerKpiClientes() 
    {
        return clienteService.calcularPromedioEdad();
    }

    @GetMapping("/listclientes")
    public List<Cliente> listarClientes() 
    {
        return clienteService.listarClientes();
    }
}
