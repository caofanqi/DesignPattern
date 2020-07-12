package cn.caofanqi.design.pattern.creational.simplefactory;

/**
 * <p>Description: 香蕉 </p>
 *
 * @author caofanqi
 * @since 2020/7/12 13:30
 */
public class Banana extends Fruit {

    @Override
    public void get() {
        System.out.println("采集香蕉");
    }

}
