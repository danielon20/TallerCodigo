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
public class Doctor extends Persona {
    String usuario;
    String clave;
    String nombre;
    String apellido;
    String cedula;
    String direccion;
    Date fechaNac;
    int regDoctor; //adicional
    String especialidad; //adicional

    public Doctor() {
    }

    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, int regDoctor, String especialidad) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
    }
    
    public void recetar(){
        
    }
    
    public void agregarPlanNut(){
        
    }
    
    public void imprimirReceta(){
        
    }
    
    public void registraSecretaria(){
        
    }
    
}
