package com.atguigu.mapper;

import com.atguigu.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee queryById(Integer id);
    int deleteById(Integer id);
    List<Employee> queryBySalary(Double salary);
}
