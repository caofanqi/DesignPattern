package cn.caofanqi.design.pattern.structural.decorator;

/**
 * <p>Description: 抽象装饰角色 </p>
 *
 * @author caofanqi
 * @since 2020/11/8 13:08
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

}
