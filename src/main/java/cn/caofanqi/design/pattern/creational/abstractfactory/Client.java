package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/7/12 13:31
 */
public class Client {

    public static void main(String[] args) {

        FruitFactory chinaFruitFactory = new ChinaFruitFactory();
        chinaFruitFactory.getApple().get();
        chinaFruitFactory.getBanana().get();


        // 替换整个产品族只需要替换对应的工厂即可
        FruitFactory japanFruitFactory = new JapanFruitFactory();
        japanFruitFactory.getApple().get();
        japanFruitFactory.getBanana().get();

    }

}
