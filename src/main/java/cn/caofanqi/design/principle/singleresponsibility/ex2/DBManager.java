package cn.caofanqi.design.principle.singleresponsibility.ex2;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/22 23:23
 */
public class DBManager {

    public void save(String username, String password) {
        System.out.println(username + "," + password + ",保存到数据库");
    }

}
