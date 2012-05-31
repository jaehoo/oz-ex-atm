import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 29/05/12
 * Time: 06:52 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = {"classpath:appcontext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Test extends AbstractJUnit4SpringContextTests{

    public static final Logger log= LoggerFactory.getLogger(Test.class);

    @org.junit.Test
    public void testA(){
       log.info("ALGO================ {}");
    }

}
