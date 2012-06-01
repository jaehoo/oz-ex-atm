package oz.controller.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 30/05/12
 * Time: 06:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloController implements Controller {

    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest
            , HttpServletResponse httpServletResponse) throws Exception {

        logger.info("Enter to Hello Controller =) !! ");

        return new ModelAndView("hello");
    }
}
