package cn.caofanqi.design.pattern.creational.simplefactory;

/**
 * <p>Description: 苹果 </p>
 *
 * @author caofanqi
 * @since 2020/7/12 13:29
 */
public class Apple extends Fruit {

    @Override
    public void get() {
        System.out.println("采集苹果");
    }

}
