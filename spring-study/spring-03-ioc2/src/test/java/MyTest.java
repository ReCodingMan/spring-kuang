import com.cc.pojo.User;
import com.cc.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        user.show();

//        UserT usert = (UserT) context.getBean("userT");
//        usert.show();

    }
}
