package model.dao.impl;

import model.dao.Transferencias;
import org.junit.Test;
import util.AbstractTest;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 21/05/12
 * Time: 01:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransferenciasCajeroTest extends AbstractTest {

    @Resource(name = "dao.trans")
    private Transferencias trans;

    @Test
    public void testTransferir() throws Exception {

        trans.transferir(400.00);

    }
}
