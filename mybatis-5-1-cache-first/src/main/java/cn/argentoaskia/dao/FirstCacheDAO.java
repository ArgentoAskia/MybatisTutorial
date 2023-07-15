package cn.argentoaskia.dao;

import cn.argentoaskia.beans.FilmTextBean;
import org.apache.ibatis.annotations.Param;

/**
 * FilmInfo-ResultMap实现表级联查询
 */
public interface FirstCacheDAO {
    FilmTextBean selectAllByFilmId(@Param("id") Integer id);
    FilmTextBean selectAllByFilmIdWithNoCache(@Param("id") Integer id);
}
