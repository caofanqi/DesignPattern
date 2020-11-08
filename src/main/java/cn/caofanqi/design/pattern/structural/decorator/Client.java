package cn.caofanqi.design.pattern.structural.decorator;

/**
 * <p>Description: 客户端 </p>
 *
 * @author caofanqi
 * @since 2020/11/8 13:05
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        System.out.println("===================");
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        System.out.println("=====================");
        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();

    }
}
