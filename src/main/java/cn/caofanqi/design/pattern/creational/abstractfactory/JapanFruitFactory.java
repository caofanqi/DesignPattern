package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 日本水果工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:56
 */
public class JapanFruitFactory extends FruitFactory {

    @Override
    public Apple getApple() {
        return new JapanApple();
    }

    @Override
    public Banana getBanana() {
        return new JapanBanana();
    }

    @Override
    public Orange getOrange() {
        return new JapanOrange();
    }

}
