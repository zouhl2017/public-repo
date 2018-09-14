package com.zafkiel.Service.impl;

import com.zafkiel.Service.IMyFunction;




public class MyFunctionImpl2 implements IMyFunction {
    @Override
    public void printHello() {
        System.out.println("MyFunctionImpl2:Hello");
    }

    @Override
    public void printNero() {
        System.out.println("MyFunctionImpl2:Nero");
    }
}
