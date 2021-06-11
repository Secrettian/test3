package com.spring01.impl;

import com.spring01.CPU;

/**
 * @author Secret
 * @create 2021-06-11 上午 11:40
 */

public class AMDcpu  implements CPU{
    @Override
    public void run() {
        System.out.println("amd的cpu在运行");
    }
}
