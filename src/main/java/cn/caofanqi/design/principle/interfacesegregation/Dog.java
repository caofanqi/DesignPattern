package cn.caofanqi.design.principle.interfacesegregation;

/**
 * <p>Description: Dog </p>
 *
 * @author caofanqi
 * @since 2020/6/25 3:00
 */
public class Dog implements EatAction,SwingAction {

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void swing() {
        System.out.println("dog swing");
    }

}
