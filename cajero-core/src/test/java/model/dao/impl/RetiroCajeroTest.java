package model.dao.impl;

import model.dao.Retiros;
import org.junit.Test;
import util.AbstractTest;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 21/05/12
 * Time: 01:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class RetiroCajeroTest extends AbstractTest {


    @Resource(name = "dao.retiro")
    private Retiros retiro;

    @Test
    public void testRetirarEfectivo() throws Exception {

        retiro.retirarEfectivo(200.00);

    }
}
