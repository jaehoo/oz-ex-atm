/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import model.dao.Transferencias;

/**
 *
 * @author alberto
 */
public class TransferenciasCajero implements Transferencias {

    @Override
    public void transferir(int monto) {
        System.out.println("trans:"+ monto);
    }
    
}
