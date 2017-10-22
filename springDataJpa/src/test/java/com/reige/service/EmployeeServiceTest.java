package com.reige.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by REIGE on 2017/10/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class EmployeeServiceTest {

    @Resource
    private EmployeeService employeeService;

    @Test
    public void update() {
        employeeService.update(10011, "H");
    }
}
