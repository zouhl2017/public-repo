package com.zafkiel.Service.impl;

import com.zafkiel.Service.IMyFunction;


public class MyFunctionImpl1 implements IMyFunction {
    @Override
    public void printHello() {
        System.out.println("MyFunctionImpl1:Hello");
    }

    @Override
    public void printNero() {
        System.out.println("MyFunctionImpl1:Nero");
    }
}
