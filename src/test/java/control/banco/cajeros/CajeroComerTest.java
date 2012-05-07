package control.banco.cajeros;

import control.service.Cajero;
import org.junit.Test;
import util.AbstractTest;

/**
 * Date: 2/05/12
 * Time: 02:22 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
public class CajeroComerTest extends AbstractTest {
    @Test
    public void testRetiro() throws Exception {
                           Cajero variable=(Cajero) applicationContext.getBean("cajeroComer");

        variable.retiro(100);
    }

    @Test
    public void testTransferir() throws Exception {

    }
}
