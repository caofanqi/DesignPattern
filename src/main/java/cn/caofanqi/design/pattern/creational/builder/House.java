package cn.caofanqi.design.pattern.creational.builder;

/**
 * <p>Description: 具体产品 </p>
 *
 * @author caofanqi
 * @since 2020/7/18 14:06
 */
public class House {

    private String roof;

    private String wall;

    private String floor;

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", wall='" + wall + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
