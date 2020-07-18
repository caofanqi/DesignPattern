package cn.caofanqi.design.pattern.creational.builder;

/**
 * <p>Description: 平房建造者 </p>
 *
 * @author caofanqi
 * @since 2020/7/18 14:11
 */
public class BungalowBuilder extends HouseBuilder {

    private House house = new House();

    @Override
    public void builderRoof() {
        house.setRoof("平房房顶");
    }

    @Override
    public void builderWall() {
        house.setWall("平房墙壁");
    }

    @Override
    public void builderFloor() {
        house.setFloor("平房地板");
    }

    @Override
    public House build() {
        return house;
    }

}
