package com.zafkiel.Service;

import com.zafkiel.BaseJunit4Test;
import com.zafkiel.Proxy.TestProxy;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestProxyTest extends BaseJunit4Test {
    @Autowired
    private TestProxy testProxy;
    int num = 20000000;

    @Test
    public void test() {

      Long start=  System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            testProxy.count();
        }
        Long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start));
    }

}
