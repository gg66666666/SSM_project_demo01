package com.tong.ssm;

import com.tong.ssm.entity.Emp;
import com.tong.ssm.entity.EmpExample;
import com.tong.ssm.mappers.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {


    @Test
    public void test1() throws IOException {

//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//
//        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
//
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//
//        EmpExample example = new EmpExample();
//        example.createCriteria().andAgeGreaterThan(16).andSexEqualTo("女");
//
//        List<Emp> emps = mapper.selectByExampleAndDept(example);
//
//        emps.forEach(System.out::println);

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
//        EmpMapper bean = context.getBean(EmpMapper.class);
//
//        Emp emp = bean.selectByPrimaryKeyAndDept(5);
//
//        System.out.println(emp);

        System.out.println("第二次添加");

        System.out.println("第三次提交");

        System.out.println("hot-fix1");

        System.out.println("hot-fix2");

        System.out.println("master...");

        System.out.println("hot-fix3");

    }


}
