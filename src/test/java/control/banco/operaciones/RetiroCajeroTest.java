/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.banco.operaciones;

import model.dao.impl.RetiroCajero;
import model.dao.Retiros;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;

/**
 *
 * @author alberto
 */
public class RetiroCajeroTest {
    
    private Retiros retiros;
    
    public RetiroCajeroTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() {
       
        retiros= new RetiroCajero();
        
        retiros.retirarEfectivo(100);
        
        
        
    }
}
