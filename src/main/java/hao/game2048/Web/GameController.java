package hao.game2048.Web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * create by hao 2018/6/5
 */
@RestController
public class GameController {
    @RequestMapping(value = "2048",method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
