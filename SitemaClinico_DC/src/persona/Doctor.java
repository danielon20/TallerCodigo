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
   
    protected int regDoctor; //adicional
    protected String especialidad; //adicional

    public Doctor() {
    }

    public Doctor(int regDoctor, String especialidad, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
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
