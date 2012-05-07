package control.banco.cajeros;

import control.service.Cajero;
import org.junit.Before;
import org.junit.Test;
import util.AbstractTest;

/**
 * Date: 2/05/12
 * Time: 01:21 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
public class CajeroAutomaticoTest extends AbstractTest {


    private Cajero cajero;

    @Before
    public void setUpClass() throws Exception {
            cajero = (Cajero) applicationContext.getBean("cajeroOtzo");
    }

@Test
    public void testRetiro() throws Exception {

        cajero.retiro(200);

    }

    @Test
    public void testTransferir() throws Exception {

        cajero.transferir(300);

    }



}
