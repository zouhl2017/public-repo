package com.zafkiel.Proxy.impl;

import com.zafkiel.Proxy.Test;

public class CreateProxyTest {
  public  void  func(){}
    public static void main(String[] args) {
        //创建测试对象；
        Test nativeTest = new TestImpl();
        Test dynamicProxy = null;
        Test cglibProxy = null;
        Long time1 = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            dynamicProxy = DynamicProxyTest.newProxyInstance(nativeTest);
        }
        Long time2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            cglibProxy = CglibProxyTest.newProxyInstance(TestImpl.class);
        }
        Long time3 = System.currentTimeMillis();
        System.out.println("dynamicProxy time:" + (time2 - time1));
        System.out.println("cglibProxy time:"+(time3-time2));
    }

}
