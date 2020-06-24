package cn.caofanqi.design.principle.dependenceinversion.ex2;

/**
 * <p>Description: 三星内存 </p>
 *
 * @author caofanqi
 * @since 2020/6/25 1:52
 */
public class SamsungMemory implements Memory {

    @Override
    public void work() {
        System.out.println("samsung memory work");
    }
}
