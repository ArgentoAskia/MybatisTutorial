package cn.argentoaskia.dao;

import cn.argentoaskia.beans.FilmTextBean;

import java.util.List;

/**
 * 使用ResultMap来解决查询列名和实体类字段名不一致的问题！
 */
public interface FilmTextDAOResultMap {
    // 采用ResultMap方法
    List<FilmTextBean> selectAll1();
    // 采用AS命名的方式
    List<FilmTextBean> selectAll2();

    // problem
    // 查询出来的二维表字段名和实体类字段名不匹配出现数据全是NULL的情况
    List<FilmTextBean> selectAll3();
}
