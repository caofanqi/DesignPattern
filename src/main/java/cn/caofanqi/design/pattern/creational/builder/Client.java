package cn.caofanqi.design.pattern.creational.builder;

/**
 * <p>Description: //Client</p>
 *
 * @author caofanqi
 * @since 2020/7/18 14:29
 */
public class Client {

    public static void main(String[] args) {
        HouseBuilder houseBuilder = new BungalowBuilder();
        HouseDirector.makeHouse(houseBuilder);
        House house = houseBuilder.build();
        System.out.println(house);

    }
}
