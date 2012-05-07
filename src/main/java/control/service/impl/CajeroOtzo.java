package control.service.impl;

import control.service.Cajero;
import model.dao.Retiros;

/**
 * Date: 2/05/12
 * Time: 01:48 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
public class CajeroOtzo implements Cajero {

    private Retiros retiros;

    public void setRetiros(Retiros retiros) {
        this.retiros = retiros;
    }

    @Override
    public void retiro(int monto) {
        retiros.retirarEfectivo(monto);

    }

    @Override
    public void transferir(int monto) {
        System.out.println("NO ME CHINGEN!!!");
    }
}
