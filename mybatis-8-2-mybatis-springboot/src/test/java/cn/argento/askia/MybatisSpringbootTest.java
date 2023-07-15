package cn.argento.askia;

import cn.argento.askia.bean.Department;
import cn.argento.askia.dao.DepartmentDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisSpringbootTest {

    @Autowired
    private DepartmentDAO departmentDAO;

    // 注意使用的是org.junit.jupiter.api.Test而不是org.junit.Test
    @Test
    public void test(){
        System.out.println(departmentDAO);
        List<Department> departments = departmentDAO.selectAll();
        departments.forEach(System.out::println);
    }

}
