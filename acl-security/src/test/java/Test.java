import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 29/05/12
 * Time: 06:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test extends TestCase{

    public static final Logger log= LoggerFactory.getLogger(Test.class);

    @org.junit.Test
    public void testA(){


        log.debug("ALGO================");
    }

}
