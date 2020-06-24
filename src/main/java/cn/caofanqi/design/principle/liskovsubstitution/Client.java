package cn.caofanqi.design.principle.liskovsubstitution;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/24 0:43
 */
public class Client {

    public static void main(String[] args) {
        Bird bird = new Bird();
        testFly(bird);

        Eagle eagle = new Eagle();
        testFly(eagle);

        //企鹅不会飞,可以继承鸟类么？

    }

    public static void testFly(Bird bird) {
        bird.fly();
    }

}
