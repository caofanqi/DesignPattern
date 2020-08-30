package cn.caofanqi.design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: 具体原型类，实现Cloneable接口，重写Object的clone方法 </p>
 *
 * @author caofanqi
 * @since 2020/8/30 23:24
 */
public class Person implements Cloneable {

    private String name;

    private int age;

    private List<String> friendNames;

    /**
     * 如果直接使用Object中的clone方法，是进行浅克隆，引用类型的属性，不会对引用的对象也做一份拷贝，需要自己进行重写，达到深拷贝。
     */
    @Override
    protected Person clone() throws CloneNotSupportedException {
//        return (Person) super.clone();
        Person person = (Person) super.clone();
        List<String> cloneFriendNames = new ArrayList<>(friendNames);
        person.setFriendNames(cloneFriendNames);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendNames=" + friendNames +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<String> friendNames) {
        this.friendNames = friendNames;
    }
}
