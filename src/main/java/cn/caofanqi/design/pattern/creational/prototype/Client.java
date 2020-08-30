package cn.caofanqi.design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description:  </p>
 *
 * @author caofanqi
 * @since 2020/8/30 23:27
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        List<String> friendNames = new ArrayList<>();
        friendNames.add("李四");
        friendNames.add("王五");
        p1.setFriendNames(friendNames);

        Person p2 = p1.clone();

        System.out.println(p1);
        System.out.println(p2);

        //如果没有进行深克隆，直接就该引用类型的属性会出现问题
        List<String> p1FriendNames = p1.getFriendNames();
        p1FriendNames.add("赵六");
        System.out.println(p1);
        System.out.println(p2);

    }
}
