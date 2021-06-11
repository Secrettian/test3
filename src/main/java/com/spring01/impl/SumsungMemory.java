package com.spring01.impl;

import com.spring01.Memory;

/**
 * @author Secret
 * @create 2021-06-11 下午 02:02
 */
public class SumsungMemory implements Memory {
    @Override
    public void read() {
        System.out.println("三星内存读取数据");
    }

    @Override
    public void write() {
        System.out.println("三星内存写入数据");
    }
}
