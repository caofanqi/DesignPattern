package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 日本苹果 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:49
 */
public class JapanApple implements Apple {

    @Override
    public void get() {
        System.out.println("采集日本苹果！");
    }

}
