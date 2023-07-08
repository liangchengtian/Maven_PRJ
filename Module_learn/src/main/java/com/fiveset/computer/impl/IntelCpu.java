package com.fiveset.computer.impl;

import com.fiveset.computer.inter_face.Cpu;

public class IntelCpu implements Cpu {
    public void run() {
        System.out.println("英特尔cpu正在读写指令");
    }
}
