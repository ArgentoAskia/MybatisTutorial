package cn.argento.askia.dao;


import cn.argento.askia.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentDAO {

    @Select("SELECT * FROM department")
    List<Department> selectAll();
}
