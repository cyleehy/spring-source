import cn.hy.beans.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.hy")
public class MainStat {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStat.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.sayHi();

	}

}
