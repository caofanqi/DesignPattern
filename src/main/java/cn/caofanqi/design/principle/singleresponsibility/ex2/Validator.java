package cn.caofanqi.design.principle.singleresponsibility.ex2;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/22 23:21
 */
public class Validator {

    public boolean validate(String username, String password) {
        if (username == null || "".equals(username)) {
            System.out.println("用户名不能为空");
            return false;
        }

        if (password == null || "".equals(password)) {
            System.out.println("密码不能为空");
            return false;
        }

        return true;
    }

}
