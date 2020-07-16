package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 中国香蕉 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:51
 */
public class ChinaBanana implements Banana {

    @Override
    public void get() {
        System.out.println("采集中国香蕉！");
    }

}
