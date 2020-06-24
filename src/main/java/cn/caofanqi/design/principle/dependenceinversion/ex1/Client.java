package cn.caofanqi.design.principle.dependenceinversion.ex1;

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

        //如果电脑的某个部件坏了，又买不到固定的原件怎么办？

    }

}
