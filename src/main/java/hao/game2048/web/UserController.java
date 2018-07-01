package hao.game2048.web;

import hao.game2048.dao.UserDao;
import hao.game2048.dto.Message;
import hao.game2048.dto.MessageEnum;
import hao.game2048.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 * Create by hao
 * 2018/7/1
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping
    public ModelAndView user() {
        return new ModelAndView("user/user");
    }

    @PostMapping
    public Message addUser(User user) {
        if (user == null) return new Message(MessageEnum.valueOf("ERROR"));
        System.out.println("user : " + user);
        User result = userDao.save(user);
        System.out.println("result : " + result);
        return new Message(MessageEnum.valueOf("SUCCESS"));
    }

    @GetMapping("/name")
    public Boolean checkName(@RequestParam("name") String name) {
        System.out.println(name);
        Optional<User> result = userDao.findByName(name);
        if (result.isPresent()) {
            System.out.println(result.get());
            return false;
        } else {
            return true;
        }
    }
}
