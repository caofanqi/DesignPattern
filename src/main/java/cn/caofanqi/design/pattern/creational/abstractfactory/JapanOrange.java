package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 日本橘子 </p>
 *
 * @author caofanqi
 * @since 2020/7/17 0:01
 */
public class JapanOrange implements Orange {

    @Override
    public void get() {
        System.out.println("采集日本橘子！");
    }

}
