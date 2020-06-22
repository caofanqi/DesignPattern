package cn.caofanqi.design.principle.singleresponsibility.ex1;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/22 22:38
 */
public class Client {

    public static void main(String[] args) {

        SaveToDB saveToDB = new SaveToDB();
        saveToDB.input();
        if (saveToDB.validate()) {
            saveToDB.save();
        }

    }

}
