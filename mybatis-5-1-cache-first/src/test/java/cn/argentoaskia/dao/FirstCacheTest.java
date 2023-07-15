package cn.argentoaskia.dao;

import cn.argentoaskia.beans.FilmTextBean;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class FirstCacheTest {

    private SqlSession sqlSession;
    private FirstCacheDAO mapper;
    @Before
    public void before(){
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream mybatisConfig = FirstCacheDAO.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfig);
        sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(FirstCacheDAO.class);
    }

    @After
    public void after(){
        sqlSession.close();
    }

    @Test
    public void testFirstCache(){
        FilmTextBean filmTextBeans = mapper.selectAllByFilmId(1);
        System.out.println("============= 1.一级缓存演示 =============");
        System.out.println("最先查询出来的数据（数据1）：" + filmTextBeans);
        System.out.println();
        System.out.println("调用Setter方法修改FilmTitle...");
        filmTextBeans.setFilmTitle("1234567890AAA");
        System.out.println("现在数据（数据2）变成了：" + filmTextBeans);
        System.out.println();
        System.out.println("再次进行相同的查询...");
        FilmTextBean filmInfo = mapper.selectAllByFilmId(1);
        System.out.println("再次查询出来的数据竟然和（数据2）一摸一样：");
        System.out.println("并且Mybatis日志中只有一次查询，第二次查询不执行！！");
        System.out.println(filmInfo);
        System.out.println("并且第一次查询结果对象和第二次查询结果对象是：" + (filmTextBeans == filmInfo));
        System.out.println("这就是Mybatis一级缓存啦~！");
    }

    @Test
    public void testNoFirstCache(){
        FilmTextBean filmTextBeans = mapper.selectAllByFilmIdWithNoCache(1);
        System.out.println("============= 2.关闭一级缓存演示 =============");
        System.out.println("最先查询出来的数据（数据1）：" + filmTextBeans);
        System.out.println();
        System.out.println("调用Setter方法修改FilmTitle...");
        filmTextBeans.setFilmTitle("1234567890AAA");
        System.out.println("现在数据（数据2）变成了：" + filmTextBeans);
        System.out.println();
        System.out.println("再次进行相同的查询...");
        FilmTextBean filmInfo = mapper.selectAllByFilmIdWithNoCache(1);
        System.out.println("由于指定了flushCache，所以再次查询的结果仍是数据库的结果！");
        System.out.println("并且查询执行了2次！！");
        System.out.println("现在两个查询结果：" + (filmInfo == filmTextBeans));
        System.out.println(filmInfo);
    }
}
