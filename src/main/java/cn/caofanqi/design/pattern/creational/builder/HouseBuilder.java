package cn.caofanqi.design.pattern.creational.builder;


/**
 * <p>Description: 抽象建造者 </p>
 *
 * @author caofanqi
 * @since 2020/7/18 14:09
 */
public abstract class HouseBuilder {

    public abstract void builderRoof();

    public abstract void builderWall();

    public abstract void builderFloor();

    public abstract House build();

}
