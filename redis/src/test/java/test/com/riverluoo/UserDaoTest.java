package test.com.riverluoo;

import com.riverluoo.generic.User;
import com.riverluoo.generic.UserDaoImpl;
import org.junit.Test;

/**
 * @author wangyang
 * @since 2018-12-07 10:05
 */
public class UserDaoTest {

    @Test
    public  void test(){
        UserDaoImpl userDao=new UserDaoImpl();
        User user1=new User();
        userDao.save(user1);


    }
}
