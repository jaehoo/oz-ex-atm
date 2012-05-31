package oz.controller.web;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 30/05/12
 * Time: 07:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloControllerTest extends TestCase{

    @Test
    public void testHandleRequest() throws Exception {

        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello.jsp", modelAndView.getViewName());
    }

    @Test
    public void testHandleRequest1() throws Exception {

        HelloWorldController controller = new HelloWorldController();
        ModelAndView modelAndView = controller.helloWorld();
        assertEquals("helloWorld", modelAndView.getViewName());
    }




}
