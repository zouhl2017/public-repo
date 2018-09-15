package com.zafkiel.Proxy.impl;

import com.zafkiel.Proxy.Test;

public class TestImpl implements Test {
    @Override
    public int test(int i) {
        return i+1;
    }
}
