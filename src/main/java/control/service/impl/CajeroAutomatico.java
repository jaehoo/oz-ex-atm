/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.service.impl;

import control.service.Cajero;
import model.dao.Retiros;
import model.dao.Transferencias;

/**
 *
 * @author alberto
 */
public class CajeroAutomatico implements Cajero {
    
    private Transferencias trans;
    private Retiros retiros;

    public CajeroAutomatico(Transferencias trans, Retiros retiros) {
        this.trans = trans;
        this.retiros = retiros;
    }

    @Override
    public void retiro(int monto) {

        retiros.retirarEfectivo(monto);

    }

    @Override
    public void transferir(int monto) {

        trans.transferir(monto);

    }
    
}
