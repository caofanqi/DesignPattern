package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 中国橘子 </p>
 *
 * @author caofanqi
 * @since 2020/7/17 0:00
 */
public class ChinaOrange implements Orange {

    @Override
    public void get() {
        System.out.println("采集中国橘子！");
    }

}
