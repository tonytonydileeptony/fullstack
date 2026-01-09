package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("applicationBeanContext.xml");
      MyBean myBean= (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean.toString());
    }
    /*private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }*/
}
