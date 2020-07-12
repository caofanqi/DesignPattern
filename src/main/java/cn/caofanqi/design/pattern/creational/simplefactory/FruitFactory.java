package cn.caofanqi.design.pattern.creational.simplefactory;

/**
 * <p>Description: 水果工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/12 13:33
 */
public class FruitFactory {

    public static final String APPLE = "apple";

    public static final String BANANA = "banana";

    public static Fruit getFruit(String type) {
        if (APPLE.equalsIgnoreCase(type)) {
            return new Apple();
        } else if (BANANA.equalsIgnoreCase(type)) {
            return new Banana();
        } else {
            throw new IllegalArgumentException("unknown fruit type: " + type);
        }

    }

}
