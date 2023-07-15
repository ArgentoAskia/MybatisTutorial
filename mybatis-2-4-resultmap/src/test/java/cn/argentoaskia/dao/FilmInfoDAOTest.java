package cn.argentoaskia.dao;

import cn.argentoaskia.beans.FilmInfo;
import cn.argentoaskia.beans.FilmInfoBean;
import cn.argentoaskia.beans.FilmTextActor;
import cn.argentoaskia.beans.FilmTextBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class FilmInfoDAOTest {

    private SqlSession sqlSession;
    private FilmInfoDAO mapper;
    private cn.argentoaskia.dao2.FilmInfoDAO mapper2;
    @Before
    public void before(){
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream mybatisConfig = FilmTextDAOResultMap.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfig);
        sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(FilmInfoDAO.class);
        mapper2 = sqlSession.getMapper(cn.argentoaskia.dao2.FilmInfoDAO.class);
    }

    @After
    public void after(){
        sqlSession.close();
    }

    @Test
    public void testFilmInfoDAOSelectAllWithXML(){
        List<FilmInfo> filmTextBeans = mapper.selectAll();
        for (FilmInfo f :
                filmTextBeans) {
            System.out.println(f);
        }
    }

    @Test
    public void testFilmInfoDAOSelectAllWithAnnotation(){
        List<FilmInfo> filmTextBeans = mapper2.selectAll();
        for (FilmInfo f :
                filmTextBeans) {
            System.out.println(f);
        }
    }

    @Test
    public void testFilmInfoDAOSelectAllAutoMapping(){
        List<FilmInfoBean> filmInfoBeans = mapper.selectAll3();
        filmInfoBeans.forEach(System.out::println);
    }

    @Test
    public void testFilmInfoDAoSelectAllResultMapExtends(){
        List<FilmTextActor> filmTextActors = mapper.selectAll4();
        filmTextActors.forEach(System.out::println);
    }
}
