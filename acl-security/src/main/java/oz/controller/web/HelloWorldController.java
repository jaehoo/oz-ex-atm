package oz.controller.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: alberto
 * Date: 30/05/12
 * Time: 07:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloWorldController {

    public static final Logger logger= LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("/helloWorld")
    public ModelAndView helloWorld(){

        logger.info("Hello World Controller !!!!!!!!!!");

        ModelAndView model= new ModelAndView();
        model.setViewName("helloWorld");
        model.addObject("message", " rulz!! =)");

        return model;
    }

}
