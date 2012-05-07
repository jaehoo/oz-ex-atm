package model.dao.impl;

import model.dao.CustomerManager;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import util.AbstractTest;

/**
 * Date: 7/05/12
 * Time: 01:33 PM
 *
 * @author <a href="mailto:jaehoo@gmail.com">Lic. José Alberto Sánchez</a>
 * @web www.orbitalzero.com , www.orbitalzero.org
 */
public class CustomerManagerImplTest extends AbstractTest {

     private CustomerManager cm;


    @Test
    @Transactional
    @Rollback(false)
    public void testAddCustomer() throws Exception {

        cm= (CustomerManager)applicationContext.getBean("dao.customer.manager");

        cm.addCustomer("Leonel hechizo");


    }
}
