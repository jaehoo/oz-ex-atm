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
public class FirstMappingController {

    public static final Logger logger= LoggerFactory.getLogger(FirstMappingController.class);

    @RequestMapping("/firstPage")
    public ModelAndView helloWorld(){

        logger.info("--- My First Controller =) !!");

        ModelAndView model= new ModelAndView();
        model.setViewName("first_page");
        model.addObject("message", " rulz!! =)");

        return model;
    }

}
