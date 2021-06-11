package com.spring01.impl;

import com.spring01.Memory;

/**
 * @author Secret
 * @create 2021-06-11 上午 11:45
 */
public class KingstonMemory implements Memory {
    @Override
    public void read() {
        System.out.println("金士顿内存读取文件");
    }

    @Override
    public void write() {
        System.out.println("金士顿内存写入文件");

    }
}
