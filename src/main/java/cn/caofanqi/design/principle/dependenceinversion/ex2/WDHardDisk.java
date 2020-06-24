package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: 西数硬盘 </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:54
 */
public class WDHardDisk implements HardDisk {

    @Override
    public void work() {
        System.out.println("WD hard disk work");
    }

}
