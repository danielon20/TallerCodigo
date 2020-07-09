/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recetas;

import java.util.Collection;
import java.util.Date;
import persona.Doctor;
import persona.Paciente;


/**
 *
 * @author User
 */
public class Receta {
    protected Doctor doctor;
    protected Date fecha;
    protected Paciente paciente;
    protected Collection<Medicamento> medicamentos ;
    protected PlanNutricional planNutricional;
    public Receta() {
        
        paciente = new Paciente();
        planNutricional= new PlanNutricional();    
    }

}
