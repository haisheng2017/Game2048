package hao.game2048.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by hao 2018/6/5
 */
@RequestMapping("/")
@RestController
public class MainController {
    @RequestMapping(value = "2048",method = RequestMethod.GET)
    public ModelAndView game2048(){
        return new ModelAndView("games/2048");
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
