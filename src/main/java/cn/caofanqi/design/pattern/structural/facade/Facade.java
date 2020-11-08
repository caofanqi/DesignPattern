package cn.caofanqi.design.pattern.structural.facade;

/**
 * <p>Description: 外观门面 </p>
 *
 * @author caofanqi
 * @since 2020/11/8 10:54
 */
public class Facade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    private SubSystemThree subSystemThree;

    private SubSystemFour subSystemFour;


    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }

    public void methodB() {
        subSystemThree.methodThree();
        subSystemTwo.methodTwo();
    }

}
