package cn.caofanqi.design.pattern.creational.factorymethod;

/**
 * <p>Description: 香蕉工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/12 16:32
 */
public class BananaFactory extends FruitFactory {

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

}
