/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Date;

/**
 *
 * @author User
 */
public class Administrador extends Persona{
    String usuario;
    String clave;
    String nombre;
    String apellido;
    String cedula;
    String direccion;
    Date fechaNac;

    public Administrador() {
    }

    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }
    
    public void registrarUsuario(){
        
    }
    
    public void asignarRol(Persona p){
        
    }
    
    
    
}
