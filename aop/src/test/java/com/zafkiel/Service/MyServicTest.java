package com.zafkiel.Service;

import com.zafkiel.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyServicTest extends BaseJunit4Test {
    @Autowired
    private IMyService myService;

    @Test
    public void test() throws Exception {
        myService.apple();
        System.out.println("----------------------");

        myService.banana();
        System.out.println("----------------------");

        myService.grape();
        System.out.println("----------------------");

        myService.pineapple();
        System.out.println("----------------------");

        myService.mango();
        System.out.println("----------------------");
    }
}
