package cn.caofanqi.design.pattern.structural.decorator;

/**
 * <p>Description: 具体装饰角色B</p>
 *
 * @author caofanqi
 * @since 2020/11/8 13:10
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰角色B的操作");
    }
}
