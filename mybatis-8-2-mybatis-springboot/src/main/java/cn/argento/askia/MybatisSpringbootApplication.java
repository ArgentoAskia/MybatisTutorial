package cn.argento.askia;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


// springboot 默认情况下会扫描当前包及其子包下的所有带@Mapper的DAO接口并创建实现类
@SpringBootApplication
// 使用MapperScan扫描
// @MapperScan
public class MybatisSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootApplication.class,args);
    }
}
