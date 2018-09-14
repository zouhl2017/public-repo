package com.zafkiel.Service.impl;

import com.zafkiel.Service.IMyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements IMyService {

    public final   void  notBanana(){
        System.out.println("not banana");
    }
    public  void  notApple(){
        System.out.println("not apple");
    }
    @Override
    public void apple() {
        System.out.println("apple");
    }

    @Override
    public void banana() {
        System.out.println("banana");
    }

    @Override
    public void grape() {
        System.out.println("grape");
    }

    @Override
    public void pineapple() {
        System.out.println("pineapple");
    }

    @Override
    public void mango() throws Exception {
        System.out.println("mango");
        throw  new Exception(" I  do not like mango");
    }
}
