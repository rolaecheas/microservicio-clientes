package com.rodrigo.microservicioclientes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String fechaNacimiento;
    
   

}