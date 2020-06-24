package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: AMDCpu </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:50
 */
public class AMDCpu implements Cpu {

    @Override
    public void work() {
        System.out.println("AMD cpu work");
    }

}
