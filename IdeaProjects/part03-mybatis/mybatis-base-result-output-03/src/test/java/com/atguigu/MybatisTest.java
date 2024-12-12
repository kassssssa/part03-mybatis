package com.atguigu;

import com.atguigu.mapper.EmployeeMapper;
import com.atguigu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

public class MybatisTest {
    @Test
    public void Test_01() throws IOException {
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(ips);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee emp=new Employee();
        emp.setEmpSalary(888.09);
        emp.setEmpName("aug");

        int rows=mapper.insertEmp(emp);

        sqlSession.commit();
        sqlSession.close();
    }


}
