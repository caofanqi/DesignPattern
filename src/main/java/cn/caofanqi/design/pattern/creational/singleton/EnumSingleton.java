package cn.caofanqi.design.pattern.creational.singleton;

/**
 * <p>Description: 枚举方式实现单例模式,天然防范反射和序列化安全,推荐使用 </p>
 *
 * @author caofanqi
 * @since 2020/8/23 3:12
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("do something!");
    }

}
