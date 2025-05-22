package com.example.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.example.inventario.model.*;
import com.example.inventario.repository.*;


@Service
public class AutenticasionService {
    @Autowired
    private AutenticacionRepository autenticacionRepository;

    public Usuario verificarContrasenia(Usuario usuario){
        return this.autenticacionRepository.verifica(usuario);
    }

}
