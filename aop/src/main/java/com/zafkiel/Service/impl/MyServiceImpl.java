package com.zafkiel.Service.impl;

import com.zafkiel.Service.IMyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements IMyService {

    private static int[] execute3(int[] array, int m) {
        int[] returnArr=new int[2];
        int first = 0;
        int last = array.length -1;
        int sum = 0;
        while(first < last ) {
            sum = array[first] + array[last];
            if (sum == m) {
                returnArr[0]=first+1;
                returnArr[1]=last+1;
                break;
            } else if (sum < m) {
                first++;
            } else {
                last--;
            }
        }
        return returnArr;
    }

    public  static void  main(String[] args){
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
      int[] arr=  execute3(array,3);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
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
