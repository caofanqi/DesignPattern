package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 日本香蕉 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:52
 */
public class JapanBanana implements Banana {

    @Override
    public void get() {
        System.out.println("采集日本香蕉！");
    }

}
