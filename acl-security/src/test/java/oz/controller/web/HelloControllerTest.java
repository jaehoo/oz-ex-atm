package oz.controller.web;

import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 30/05/12
 * Time: 07:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloControllerTest extends TestCase{

    public static final Logger logger= LoggerFactory.getLogger(HelloControllerTest.class);


    @Test
    public void testHandleRequest() throws Exception {

        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
    }

    @Test
    public void testHandleRequest1() throws Exception {

        FirstMappingController controller = new FirstMappingController();
        ModelAndView modelAndView = controller.helloWorld();

        assertEquals("first_page", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel().get("message"));

        String message=(String) modelAndView.getModel().get("message");

        logger.info("Returned msj :{}", message);

    }




}
