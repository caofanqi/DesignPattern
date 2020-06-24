package cn.caofanqi.design.principle.demeter;

/**
 * <p>Description: SchoolMaster </p>
 *
 * @author caofanqi
 * @since 2020/6/25 2:38
 */
public class SchoolMaster {

    public void studentNumbers(Teacher teacher) {
        teacher.studentNumbers();
    }

}
