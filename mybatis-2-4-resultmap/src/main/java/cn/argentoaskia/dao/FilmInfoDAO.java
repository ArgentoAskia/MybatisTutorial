package cn.argentoaskia.dao;

import cn.argentoaskia.beans.FilmInfo;
import cn.argentoaskia.beans.FilmInfoBean;
import cn.argentoaskia.beans.FilmTextActor;

import java.util.List;

/**
 * FilmInfo-ResultMap实现表级联查询&自动映射
 */
public interface FilmInfoDAO {
    // resultMap
    List<FilmInfo> selectAll();
    // 重命名方式解决
    List<FilmInfo> selectAll2();
    // resultmap automapping属性
    List<FilmInfoBean> selectAll3();

    List<FilmTextActor> selectAll4();
}
