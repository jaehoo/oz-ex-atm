/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import model.dao.Retiros;

/**
 *
 * @author alberto
 */
public class RetiroCajero  implements Retiros
{

    @Override
    public void retirarEfectivo(int monto) {
        System.out.println("retiraste:"+monto);
    }
}
