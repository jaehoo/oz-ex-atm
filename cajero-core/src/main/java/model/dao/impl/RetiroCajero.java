/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import model.dao.Retiros;
import model.persistence.CuentaMaestra;
import org.hibernate.SessionFactory;

/**
 *
 * @author alberto
 */
public class RetiroCajero  implements Retiros
{

    private SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void retirarEfectivo(Double monto) {

        CuentaMaestra c= new CuentaMaestra();
        c.setMonto(monto);

        sf.getCurrentSession().persist(c);
        System.out.println("Retiro: ="+monto);

    }
}
