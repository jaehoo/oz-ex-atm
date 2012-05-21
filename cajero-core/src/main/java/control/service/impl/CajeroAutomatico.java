/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.service.impl;

import control.service.Cajero;
import model.dao.Retiros;
import model.dao.Transferencias;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alberto
 */
public class CajeroAutomatico implements Cajero {
    
    private Transferencias trans;
    private Retiros retiros;

    public void setTrans(Transferencias trans) {
        this.trans = trans;
    }

    public void setRetiros(Retiros retiros) {
        this.retiros = retiros;
    }

    @Override
    @Transactional
    public void retiro(Double monto) {
        retiros.retirarEfectivo(monto);

    }

    @Override
    @Transactional
    public void transferir(Double monto) {

        retiros.retirarEfectivo(monto);
        trans.transferir(monto);

    }
    
}
