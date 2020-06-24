package cn.caofanqi.design.principle.interfacesegregation;

/**
 * <p>Description: Bird </p>
 *
 * @author caofanqi
 * @since 2020/6/25 3:00
 */
public class Bird implements EatAction, FlyAction {

    @Override
    public void eat() {
        System.out.println("bird eat");
    }

    @Override
    public void fly() {
        System.out.println("bird fly");
    }

}
