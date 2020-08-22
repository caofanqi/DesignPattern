package cn.caofanqi.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * <p>Description: 静态内部类方式单例模式,依托类加载机制 </p>
 *
 * @author caofanqi
 * @since 2020/8/23 3:01
 */
public class StaticInnerClassSingleton implements Serializable {

    //2、静态内部类
    private static class InnerClass {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    //1、私有构造方法，防止外部直接使用new进行实例化对象
    private StaticInnerClassSingleton() {
        //4、防止使用反射获取实例
        if (InnerClass.instance != null) {
            throw new RuntimeException("单例构造器禁止非法调用！");
        }
    }

    //3、对外提供访问点
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    // 5、添加 public Object readResolve 方法，返回单例对象，使序列化，反序列化安全
    public Object readResolve() {
        return InnerClass.instance;
    }

}
