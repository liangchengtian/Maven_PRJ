package com.fiveset.computer;

import com.fiveset.computer.impl.IntelCpu;
import com.fiveset.computer.impl.KingstonMemory;
import com.fiveset.computer.impl.SeagateDisk;

public class ComputerDemo {
    public static void main(String[] args) {
        //创建具体零部件
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        SeagateDisk disk = new SeagateDisk();

        //组装电脑
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setDisk(disk);

        //运行电脑
        computer.runComputer();
    }
}
