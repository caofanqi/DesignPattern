package cn.caofanqi.design.pattern.structural.facade;

/**
 * <p>Description: 客户端 </p>
 *
 * @author caofanqi
 * @since 2020/11/8 10:53
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();

        System.out.println("==================");
        facade.methodB();
    }

}
