package com.example.inventario.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.inventario.model.Inventario;

@Repository
public class InventarioRepository{
    private ArrayList<Inventario> listaInventarios = new ArrayList<>();


    public ArrayList<Inventario> obtenerInventarios(){
        return this.listaInventarios;
    }

   public Inventario buscarPorIdInventario(int id){
        for (Inventario inventario: this.listaInventarios){
            if(inventario.getId_inventario()==id){
                return inventario;
            }
        }
        return null; 
    }

    public Inventario guardar(Inventario inventario){
        this.listaInventarios.add(inventario);
        return inventario;
    }


    public Inventario actualizar(Inventario inventario){
        int id =0;
        int idPosicion =0;
        for (int i =0;i<this.listaInventarios.size();i++){
            if(this.listaInventarios.get(i).getId_inventario() == inventario.getId_inventario()){
                id =inventario.getCant_producto();
                idPosicion=i;
            }
        }//fin for
        Inventario inventario2= new Inventario();
        inventario2.setId_inventario(id);
        inventario2.setNombre_producto(inventario.getNombre_producto());
        inventario2.setCant_producto(inventario.getCant_producto());
        this.listaInventarios.set(idPosicion,inventario2);
        return inventario2;
    }

    public void eliminar(int id){
        Inventario inventario =buscarPorIdInventario(id);
        if(inventario!=null){
            this.listaInventarios.remove(inventario);
        }

    }
}