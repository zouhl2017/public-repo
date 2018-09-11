package com.zafkiel.Service.impl;

import com.zafkiel.Service.IMyFunction;
import org.springframework.stereotype.Service;


public class MyFunctionImpl1 implements IMyFunction {
    public void printHello() {
        System.out.println("MyFunctionImpl1:Hello");
    }

    public void printNero() {
        System.out.println("MyFunctionImpl1:Nero");
    }
}
