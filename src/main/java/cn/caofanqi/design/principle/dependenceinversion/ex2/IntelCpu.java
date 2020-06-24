package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: 因特尔cpu </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:36
 */
public class IntelCpu implements Cpu{

    @Override
    public void work(){
        System.out.println("intel cpu work");
    }

}
