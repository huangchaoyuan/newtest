import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangchaoyuan on 16/12/14.
 */
public class HelloProgram {

    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorldService service=(HelloWorldService)context.getBean("helloWorldService");
        HelloWorld hw=service.getHelloWorld();
        hw.sayHello();

    }
}
