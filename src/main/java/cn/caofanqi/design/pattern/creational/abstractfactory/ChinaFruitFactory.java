package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 中国水果工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:55
 */
public class ChinaFruitFactory extends FruitFactory {

    @Override
    public Apple getApple() {
        return new ChinaApple();
    }

    @Override
    public Banana getBanana() {
        return new ChinaBanana();
    }

    @Override
    public Orange getOrange() {
        return new ChinaOrange();
    }

}
