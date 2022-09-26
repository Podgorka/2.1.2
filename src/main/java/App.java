import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 = (Cat) applicationContext1.getBean("cats");
        System.out.println(bean3.getMessage());
        Cat bean4 = (Cat) applicationContext1.getBean("cats");
        System.out.println(bean4.getMessage());

        System.out.println(bean == bean2);
        System.out.println(bean3 == bean4);
    }
}