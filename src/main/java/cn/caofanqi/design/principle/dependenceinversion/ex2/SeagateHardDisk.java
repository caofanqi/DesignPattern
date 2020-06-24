package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: 希捷硬盘 </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:41
 */
public class SeagateHardDisk implements HardDisk{

    @Override
    public void work() {
        System.out.println("seagate hard disk work");
    }

}
