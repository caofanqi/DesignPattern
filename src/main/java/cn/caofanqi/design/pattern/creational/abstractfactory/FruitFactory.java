package cn.caofanqi.design.pattern.creational.abstractfactory;

/**
 * <p>Description: 抽象水果工厂 </p>
 *
 * @author caofanqi
 * @since 2020/7/16 23:42
 */
public abstract class FruitFactory {

    public abstract Apple getApple();

    public abstract Banana getBanana();

    public abstract Orange getOrange();

}
