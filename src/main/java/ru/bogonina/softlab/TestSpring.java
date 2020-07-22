package ru.bogonina.softlab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean peremTestBean = context.getBean("testBean", TestBean.class);
        //то, что в "" это id бина из applicationContext.xml;
        // второй аргумент - класс, бин кооторого хотим получить

        System.out.println(peremTestBean.getName());

        context.close();
    }
}
