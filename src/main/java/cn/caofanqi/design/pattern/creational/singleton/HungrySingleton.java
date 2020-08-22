package cn.caofanqi.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * <p>Description: 饿汉式单例模式； </p>
 *
 * @author caofanqi
 * @since 2020/8/23 1:36
 */
public class HungrySingleton implements Serializable {

    //2、类初始化时，直接实例化对象,线程安全
    private static final HungrySingleton instance = new HungrySingleton();

    //1、私有构造方法，防止外部直接使用new进行实例化对象
    private HungrySingleton() {
        //4、防止使用反射获取实例
        if (instance != null) {
            throw new RuntimeException("单例构造器禁止非法调用！");
        }
    }

    //3、对外提供访问点
    public static HungrySingleton getInstance() {
        return instance;
    }

    // 5、添加 public Object readResolve 方法，返回单例对象，使序列化，反序列化安全
    public Object readResolve() {
        return instance;
    }

}
