/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import infoMedica.HistoriaClinica;
import java.util.Date;
import recetas.Receta;

/**
 *
 * @author User
 */
public class Paciente extends Persona {
    ;
    protected String email; //adicional
    protected HistoriaClinica historiClinica;
    protected Receta receta;
   
    public Paciente() {
    }

    public Paciente(String email, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        this.email = email;
        historiClinica= new HistoriaClinica();
        receta = new Receta();
    }

    
    
    public boolean solicitarCita(){
        
        return true;
    }
    
    
    
    
}
