package cn.caofanqi.design.principle.dependenceinversion.ex1;

/**
 * <p>Description: Computer </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:34
 */
public class Computer {

    private IntelCpu intelCpu;

    private KingstonMemory kingstonMemory;

    private SeagateHardDisk seagateHardDisk;

    public Computer(IntelCpu intelCpu, KingstonMemory kingstonMemory, SeagateHardDisk seagateHardDisk) {
        this.intelCpu = intelCpu;
        this.kingstonMemory = kingstonMemory;
        this.seagateHardDisk = seagateHardDisk;
    }

    public void work() {
        this.intelCpu.work();
        this.kingstonMemory.work();
        this.seagateHardDisk.work();
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public SeagateHardDisk getSeagateHardDisk() {
        return seagateHardDisk;
    }

    public void setSeagateHardDisk(SeagateHardDisk seagateHardDisk) {
        this.seagateHardDisk = seagateHardDisk;
    }
}
