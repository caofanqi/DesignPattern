package cn.caofanqi.design.pattern.creational.builder;

/**
 * <p>Description: 指挥者 </p>
 *
 * @author caofanqi
 * @since 2020/7/18 14:14
 */
public class HouseDirector {

    public static void makeHouse(HouseBuilder houseBuilder) {
        houseBuilder.builderRoof();
        houseBuilder.builderWall();
        houseBuilder.builderFloor();
    }

}
