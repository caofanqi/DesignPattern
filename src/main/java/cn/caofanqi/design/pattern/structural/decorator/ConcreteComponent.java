package cn.caofanqi.design.pattern.structural.decorator;

/**
 * <p>Description: 具体组件角色 </p>
 *
 * @author caofanqi
 * @since 2020/11/8 13:07
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
