package com.fiveset.computer;

import com.fiveset.computer.inter_face.Cpu;
import com.fiveset.computer.inter_face.Disk;
import com.fiveset.computer.inter_face.Memory;

public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void runComputer() {
        System.out.println("计算机工作中");
        memory.save();
        cpu.run();
        disk.readAndWrite();
    }
}
