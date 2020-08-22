package cn.caofanqi.design.pattern.creational.singleton;

/**
 * <p>Description: 懒汉式单例模式 </p>
 *
 * @author caofanqi
 * @since 2020/8/23 2:18
 */
public class LazySingleton {

    //2、使用时在进行初始化,添加volatile，防止指令重排序
    private volatile static LazySingleton instance;

    //1、私有构造方法，防止外部直接使用new进行实例化对象
    private LazySingleton() {
    }

    //3、对外提供访问点,对实例进行判断，初次使用时，实例化对象，这里无法控制使用反射进行获取实例,因为instance不能声明为final
    public static LazySingleton getInstance() {
        //4、使用double check方式，控制线程安全
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // 5、添加 public Object readResolve 方法，返回单例对象，使序列化，反序列化安全
    public Object readResolve() {
        return instance;
    }

}
