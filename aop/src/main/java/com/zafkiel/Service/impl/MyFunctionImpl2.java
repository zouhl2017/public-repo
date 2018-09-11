package com.zafkiel.Service.impl;

import com.zafkiel.Service.IMyFunction;
import org.springframework.stereotype.Service;



public class MyFunctionImpl2 implements IMyFunction {
    public void printHello() {
        System.out.println("MyFunctionImpl2:Hello");
    }

    public void printNero() {
        System.out.println("MyFunctionImpl2:Nero");
    }
}
