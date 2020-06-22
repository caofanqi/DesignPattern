package cn.caofanqi.design.principle.singleresponsibility.ex2;

import java.util.Scanner;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/6/22 23:19
 */
public class Input {

    private String username;

    private String password;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        this.username = sc.nextLine();
        System.out.println("请输入密码：");
        this.password = sc.nextLine();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
