package com.example.inventario.controller;

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
@RequestMapping("/autenticacion")
public class AutenticacionController {
    @Autowired
    private AutenticacionController autenticacionController;
    
}
