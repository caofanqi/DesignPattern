package cn.caofanqi.design.pattern.creational.factorymethod;

/**
 * <p>Description: 苹果工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/12 16:32
 */
public class AppleFactory extends FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

}
