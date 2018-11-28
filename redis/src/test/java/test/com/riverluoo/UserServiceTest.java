package test.com.riverluoo;


import com.riverluoo.Application;
import com.riverluoo.dao.entity.User;
import com.riverluoo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void inserTest() {
        int id = new Random().nextInt(10000);
        User user = new User(id, "root", "root");
        userService.createUser(user);

        User user2 = userService.getById(id);
        assertEquals(user2.getPassword(), "root");
        user.setPassword("abc");
        userService.updateUser(user);
        User user3 = userService.getById(id);
        assertEquals(user3.getPassword(), "abc");
        userService.deleteById(id);
        assertNull(userService.getById(id));
    }

    @Test
    public void selectTest() {

        User user1 = userService.getById(52);
        assertEquals(user1.getPassword(), "admin");
    }
}
