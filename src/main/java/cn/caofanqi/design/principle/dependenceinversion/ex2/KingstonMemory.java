package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: 金士顿内存</p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:38
 */
public class KingstonMemory implements Memory{

    @Override
    public void work() {
        System.out.println("kingston memory work");
    }

}
