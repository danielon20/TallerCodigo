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
   

    public Administrador() {
    }

    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
    }

    
    
    
    public void registrarUsuario(){
        
    }
    
    public void asignarRol(Persona p){
        
    }
    
    
    
}
