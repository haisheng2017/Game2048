package hao.game2048.dao;

import hao.game2048.entity.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * create by hao 2018/6/21
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void saveTest() {
        User user = new User();
        user.setName("test");
        user.setUrl("www.test.com");
        User result = userDao.save(user);
        assertNotNull(user.getId());
        System.out.println(user);
        System.out.println(result);
    }

    @Test
    public void findOneTest() throws Exception {
        Optional<User> user = userDao.findById(1);
        assertNotNull(user.get());
        assertTrue(1 == user.get().getId());
        System.out.println(user);
    }
}