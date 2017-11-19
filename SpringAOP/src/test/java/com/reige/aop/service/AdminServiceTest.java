package com.reige.aop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by REIGE on 2017/11/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AdminServiceTest {
    @Resource
    private AdminService adminService;

    @Resource
    private LogService logService;
    @Test
    public void adminDoSomethingTest() throws IllegalAccessException {
        adminService.adminDoSomething();
    }

    @Test
    public void printLogTest() {
        logService.printLog();
    }

    @Test
    public void printLogTest2() {
        String s = logService.printLog((long) 1231);
        System.out.println("test-->"+s);
    }
}