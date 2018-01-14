import action.LoginAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        //1.创建一个Spring的IOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //3.调用sayHello（）方法
        helloWorld.sayHello();

        LoginAction loginAction = (LoginAction) context.getBean("loginAction");
        loginAction.execute();
    }
}
