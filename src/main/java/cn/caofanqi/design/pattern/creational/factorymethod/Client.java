package cn.caofanqi.design.pattern.creational.factorymethod;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/7/12 13:31
 */
public class Client {

    public static void main(String[] args) {

        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();


        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();

        FruitFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.getFruit();
        orange.get();
    }

}
