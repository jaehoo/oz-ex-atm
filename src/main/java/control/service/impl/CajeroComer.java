package control.service.impl;

import control.service.Cajero;
import model.dao.Retiros;
import model.dao.Transferencias;

/**
 * Date: 2/05/12
 * Time: 02:09 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
public class CajeroComer implements Cajero {

    private Retiros miretiro;

    public void setMiretiro(Retiros miretiro) {
        this.miretiro = miretiro;
    }

    public void setMitranfres(Transferencias mitranfres) {
        this.mitranfres = mitranfres;
    }

    private Transferencias mitranfres;

    @Override
    public void retiro(int monto) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void transferir(int monto) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
