/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagos;

import java.util.Date;

/**
 *
 * @author User
 */
public class PagoTarjeta {
   protected float monto;
   protected String numero;
   protected Date expira;
   protected String propietario;
   protected String banco;

    public PagoTarjeta() {
    }

    public PagoTarjeta(float monto, String numero, Date expira, String propietario, String banco) {
        this.monto = monto;
        this.numero = numero;
        this.expira = expira;
        this.propietario = propietario;
        this.banco = banco;
    }
    
    
}
