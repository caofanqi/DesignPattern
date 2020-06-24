package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:44
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer(new IntelCpu(), new KingstonMemory(), new SeagateHardDisk());
        computer.work();

        System.out.println("================================");
        //通过依赖接口，可以完成软件替换

        computer.setCpu(new AMDCpu());
        computer.setMemory(new SamsungMemory());
        computer.setHardDisk(new WDHardDisk());
        computer.work();

    }

}
