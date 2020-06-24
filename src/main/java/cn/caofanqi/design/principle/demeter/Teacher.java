package cn.caofanqi.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: Teacher </p>
 *
 * @author caofanqi
 * @since 2020/6/25 2:37
 */
public class Teacher {


    public void studentNumbers() {
        //模拟查询学生数量
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            students.add(new Student());
        }

        System.out.println("student numbers is : " + students.size());
    }

}
