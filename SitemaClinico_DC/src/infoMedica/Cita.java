/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoMedica;

import java.util.Date;

/**
 *
 * @author User
 */
public class Cita {
    Date fecha;
    boolean pagada;
    String registradoPor;

    public Cita() {
    }

    public Cita(Date fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }
    
    public void realizarPago(){//Completar y poner parametros
        
    }
    
            
    
    
}
