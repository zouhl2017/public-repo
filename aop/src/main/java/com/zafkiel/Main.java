package com.zafkiel;

import com.zafkiel.Service.IMyFunction;
import com.zafkiel.Service.impl.MyFunctionImpl1;
import com.zafkiel.Service.impl.MyFunctionImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMyFunction myFunction1 = (MyFunctionImpl1) context.getBean("myFunctionImpl1");
        IMyFunction myFunction2 = (MyFunctionImpl2) context.getBean("myFunctionImpl2");
        myFunction1.printHello();
        System.out.println("----------------------");
        myFunction1.printNero();
        System.out.println("----------------------");

        myFunction2.printHello();
        System.out.println("----------------------");
        myFunction2.printNero();
        System.out.println("----------------------");


    }


}
