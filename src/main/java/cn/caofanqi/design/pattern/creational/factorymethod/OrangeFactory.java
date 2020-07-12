package cn.caofanqi.design.pattern.creational.factorymethod;

/**
 * <p>Description: 橘子工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/12 16:36
 */
public class OrangeFactory extends FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Orange();
    }

}
