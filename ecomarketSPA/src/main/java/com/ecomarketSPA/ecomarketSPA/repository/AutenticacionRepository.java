package com.example.inventario.repository;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.inventario.model.Autenticacion;
import com.example.inventario.model.Inventario;
// import com.example.inventario.model.Usuario;
public class AutenticacionRepository {
    public Autenticacion verificarContrasenia(String nombre_veri){
            String contra;
            //buscar nombre en la lista
            for (int i =0;i<this.listaUsuarios.size();i++){
            
                if(this.listaUsuario.get(i).getNombre_usuario() == nombre_veri){
                    System.out.println("Usuario existente, ingrese la contraseña");
                        if(this.listaUsuario.get(i).getContrasenia() == contra){
                            System.out.println("Inicio de Sesion exitoso");
                        }
                        else
                            System.out.println("Error, contraseña erronea");
                }
                else
                System.out.println("Error, usuario no existente");
            }
        }
        return null; 
    }

