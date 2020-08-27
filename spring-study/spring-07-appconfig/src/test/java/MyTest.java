import com.cc.config.CcConfig;
import com.cc.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CcConfig.class);

        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
