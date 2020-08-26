import com.cc.dao.UserDaoMysqlImpl;
import com.cc.service.UserService;
import com.cc.service.UserServiceImpl;

public class myTest {

    public static void main(String[] args) {
        //调用service层，不调用dao层
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
