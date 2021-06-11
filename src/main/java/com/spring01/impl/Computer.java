package com.spring01.impl;

import com.spring01.CPU;
import com.spring01.Memory;

/**
 * @author Secret
 * @create 2021-06-11 下午 02:04
 */
public class Computer {
    private String brand;
    private CPU cpu;
    private Memory memory;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    public  void start(){
        System.out.println(brand+"电脑启动啦");
        cpu.run();
        memory.read();
        memory.write();
    }
}
