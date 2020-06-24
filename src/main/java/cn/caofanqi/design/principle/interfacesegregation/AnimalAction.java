package cn.caofanqi.design.principle.interfacesegregation;

/**
 * <p>Description: AnimalAction ,并不是所有的动物都会飞和游泳，应拆分成多个接口 </p>
 *
 * @author caofanqi
 * @since 2020/6/25 2:56
 */
public interface AnimalAction {

    void eat();

    void fly();

    void swing();

}
