package com.example.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.example.inventario.model.*;
import com.example.inventario.repository.*;

@Service
public class InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;

    public ArrayList<Inventario> getInventarios(){
        return this.inventarioRepository.obtenerInventarios();
    }

    public Inventario saveInventario(Inventario inventario){
        return this.inventarioRepository.guardar(inventario);
    }
    
    public Inventario getInventarioId(int id){
        return this.inventarioRepository.buscarPorIdInventario(id);
    }

    public Inventario updateInventario(Inventario inventario){
        return this.inventarioRepository.actualizar(inventario);
    }

    public String deleteInventario(int id){
        this.inventarioRepository.eliminar(id);
        return "Producto eliminado existosamente";
    }
}
