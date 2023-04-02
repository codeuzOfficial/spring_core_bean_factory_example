package dasturlash.uz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("spring-config.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Student student = (Student) factory.getBean("studentJon");
        System.out.println(student);
    }
}