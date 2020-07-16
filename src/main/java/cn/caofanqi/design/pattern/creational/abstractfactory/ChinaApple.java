package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 中国苹果 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:48
 */
public class ChinaApple implements Apple {

    @Override
    public void get() {
        System.out.println("采集中国苹果！");
    }

}
