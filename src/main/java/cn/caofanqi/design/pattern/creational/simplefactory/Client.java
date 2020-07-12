package cn.caofanqi.design.pattern.creational.simplefactory;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/7/12 13:31
 */
public class Client {

    public static void main(String[] args) {
        //1、客户端知道要使用什么，并且知道怎么构造
//        Fruit apple = new Apple();
//        apple.get();
//        Fruit banana = new Banana();
//        banana.get();

        //2、简单工厂方法,客户端不关心怎么构造实例对象
        Fruit apple = FruitFactory.getFruit(FruitFactory.APPLE);
        apple.get();
        Fruit banana = FruitFactory.getFruit(FruitFactory.BANANA);
        banana.get();

    }

}
