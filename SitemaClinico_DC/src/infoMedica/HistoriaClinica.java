/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoMedica;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class HistoriaClinica {
   protected int nro;
   protected ArrayList<String> enfermedades = new ArrayList<String>();
   protected ArrayList<String> alergias = new ArrayList<String>();
   protected ArrayList<String> otros= new ArrayList<String>();

    public HistoriaClinica() {
    }

    public HistoriaClinica(int nro, ArrayList<String> enfermedades, ArrayList<String> alergias, ArrayList<String> otros) {
        this.nro = nro;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }
    
    
    
    
    
}
