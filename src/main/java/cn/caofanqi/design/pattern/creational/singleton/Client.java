package cn.caofanqi.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * <p>Description: 单例模式客户端 </p>
 *
 * @author caofanqi
 * @since 2020/8/23 1:40
 */
public class Client {

    public static void main(String[] args) throws Exception {

//        testHungrySingleton();
//        testReflect();
//        testSerializable();
//        testLazySingleton();
//        testStaticInnerClassSingleton();
//        testEnumSingleton();

        System.out.println("test...");
    }


    public static void testHungrySingleton() {

        Runnable runnable = () -> {
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        };


        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }

    public static void testLazySingleton() {

        Runnable runnable = () -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        };


        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }

    public static void testStaticInnerClassSingleton() {

        Runnable runnable = () -> {
            StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        };


        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }

    public static void testEnumSingleton() {

        Runnable runnable = () -> {
            EnumSingleton instance = EnumSingleton.INSTANCE;
            instance.doSomething();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        };


        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();

    }


    public static void testReflect() throws Exception {

        HungrySingleton instance = HungrySingleton.getInstance();
        //通过反射，强行破坏单例
        Class<HungrySingleton> clazz = HungrySingleton.class;
        Constructor<HungrySingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton newInstance = constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }

    public static void testSerializable() throws Exception {

        //将单例对象序列化
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\singleton_file"));
        oos.writeObject(instance);

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("e:\\singleton_file")));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

    }

}
