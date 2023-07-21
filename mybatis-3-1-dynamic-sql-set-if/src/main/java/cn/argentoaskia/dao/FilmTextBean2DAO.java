package cn.argentoaskia.dao;

import cn.argentoaskia.beans.FilmTextBean2;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FilmTextBean2DAO {

    /**
     * set标签实现动态更新内容
     * @param filmTextBean2
     * @return
     */
    Integer update(@Param("filmTextBean2") FilmTextBean2 filmTextBean2);

    /**
     * 不使用@Param的写法！
     * @param filmTextBean2
     * @return
     */
    Integer update2(FilmTextBean2 filmTextBean2);


    /**
     *  注解的动态SQL写法！
     * @param filmTextBean2
     * @return
     */
    @Update("")
    Integer update3(FilmTextBean2 filmTextBean2);
}
