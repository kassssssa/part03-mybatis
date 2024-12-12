package com.atguigu.mapper;

import com.atguigu.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    String queryNameById(Integer id);
    int deleteById(Integer id);
    Double querySalaryById(Integer id);
    List<String> queryNameBySalary(Double salary);
    List<Employee> queryAll();
    int insertEmp(Employee employee);
}
