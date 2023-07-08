package com.fiveset.computer.impl;

import com.fiveset.computer.inter_face.Disk;

public class SeagateDisk implements Disk {
    public void readAndWrite() {
        System.out.println("Seagate硬盘正在读和写数据");
    }
}
