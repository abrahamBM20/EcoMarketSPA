package com.example.inventario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Inventario{

    
    private int id_inventario;

    private String nombre_producto;
    private int cant_producto;
}