/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Collection;
import persona.Doctor;

/**
 *
 * @author User
 */
public class AreaMedica {
    protected Collection<Doctor> doctores ;
    protected String especialidad;
    protected float costo;

    public AreaMedica() {
    }

    public AreaMedica(Collection<Doctor> doctores, String especialidad, float costo) {
        this.doctores = doctores;
        this.especialidad = especialidad;
        this.costo = costo;
    }

    
    
    
    
}
