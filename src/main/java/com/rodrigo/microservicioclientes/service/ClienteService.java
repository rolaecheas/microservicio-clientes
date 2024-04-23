package com.rodrigo.microservicioclientes.service;


import org.springframework.stereotype.Service;

import com.rodrigo.microservicioclientes.model.Cliente;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService 
{

    private final List<Cliente> clientes = new ArrayList<>();

    public Cliente crearCliente(Cliente cliente) 
    {
        clientes.add(cliente);
        return cliente;
    }

    public double calcularPromedioEdad() 
    {
        if (clientes.isEmpty()) return 0;

        int sumaEdades = clientes.stream()
                .mapToInt(Cliente::getEdad)
                .sum();
        return (double) sumaEdades / clientes.size();
    }

    public double calcularDesviacionEstandarEdades() 
    {
        if (clientes.isEmpty()) return 0;

        double promedio = calcularPromedioEdad();
        double sumatoriaDiferenciasCuadrado = clientes.stream()
                .mapToDouble(cliente -> Math.pow(cliente.getEdad() - promedio, 2))
                .sum();
        return Math.sqrt(sumatoriaDiferenciasCuadrado / clientes.size());
    }

    public List<Cliente> listarClientes() 
    {
        return clientes;
    }
}
