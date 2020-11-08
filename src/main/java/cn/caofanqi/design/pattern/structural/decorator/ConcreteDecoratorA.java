package cn.caofanqi.design.pattern.structural.decorator;

/**
 * <p>Description: 具体装饰角色A </p>
 *
 * @author caofanqi
 * @since 2020/11/8 13:10
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰角色A的操作");
    }
}
