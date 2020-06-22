package cn.caofanqi.design.principle.singleresponsibility.ex1;

import java.util.Scanner;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/22 22:52
 */
public class SaveToDB {

    private String username;

    private String password;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        this.username = sc.nextLine();
        System.out.println("请输入密码：");
        this.password = sc.nextLine();
    }

    public boolean validate() {
        if (this.username == null || "".equals(this.username)) {
            System.out.println("用户名不能为空");
            return false;
        }

        if (this.password == null || "".equals(this.password)) {
            System.out.println("密码不能为空");
            return false;
        }

        return true;
    }

    public void save() {
        System.out.println(this.username + "," + this.password + ",保存到数据库");
    }

}
