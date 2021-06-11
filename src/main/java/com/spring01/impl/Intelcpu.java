package com.spring01.impl;

import com.spring01.CPU;

/**
 * @author Secret
 * @create 2021-06-11 上午 11:43
 */
public class Intelcpu implements CPU {
    @Override
    public void run() {
        System.out.println("intel的cpu在运行");
    }
}
