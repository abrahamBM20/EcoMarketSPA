package com.example.inventario.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventario.model.*;
import com.example.inventario.service.*;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public ArrayList<Inventario> inventario(){
        return this.inventarioService.getInventarios();
    }

    @PostMapping
    public Inventario agregarInventarios(@RequestBody Inventario inventario){
        return this.inventarioService.saveInventario(inventario);
    }

    @GetMapping("{id}")
    public Inventario buscarInvenario(@PathVariable int id){
        return this.inventarioService.getInventarioId(id);
    }
}
