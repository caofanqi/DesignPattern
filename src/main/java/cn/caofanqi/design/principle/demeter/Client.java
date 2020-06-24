package cn.caofanqi.design.principle.demeter;

/**
 * <p>Description: Client </p>
 *
 * @author caofanqi
 * @since 2020/6/25 2:44
 */
public class Client {

    public static void main(String[] args) {
        SchoolMaster schoolMaster = new SchoolMaster();
        //校长想知道学生的数量，校长和学生没必要直接通信，通过老师来进行查询
        schoolMaster.studentNumbers(new Teacher());

    }


}
