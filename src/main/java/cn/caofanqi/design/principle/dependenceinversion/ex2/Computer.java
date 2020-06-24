package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: Computer </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:34
 */
public class Computer {

    private Cpu cpu;

    private Memory memory;

    private HardDisk hardDisk;

    public Computer(Cpu cpu, Memory memory, HardDisk hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public void work() {
        this.cpu.work();
        this.memory.work();
        this.hardDisk.work();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}
