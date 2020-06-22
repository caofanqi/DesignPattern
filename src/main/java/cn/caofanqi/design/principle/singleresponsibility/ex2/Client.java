package cn.caofanqi.design.principle.singleresponsibility.ex2;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/22 23:19
 */
public class Client {

    public static void main(String[] args) {

        Input input = new Input();
        input.input();

        Validator validator = new Validator();

        if (validator.validate(input.getUsername(), input.getPassword())) {
            DBManager dbManager = new DBManager();
            dbManager.save(input.getUsername(), input.getPassword());
        }

    }

}
