package com.reige.dao;

import com.reige.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by REIGE on 2017/10/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class EmployeeDaoTest {

    @Resource
    private EmployeeDao employeeDao;

    @Test
    public void findByFirstNameTest() {
        Employee georgi = employeeDao.findByFirstName("Georgi");
        System.out.println(georgi);
    }

    @Test
    public void findByFirstNameStartingWithAndBirthDateLessThanTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("1990-12-12");
            List<Employee> g = employeeDao.findByFirstNameStartingWithAndBirthDateLessThan("G", date);
            System.out.println(g);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByFirstNameEndingWithAndBirthDateLessThanTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("1990-12-12");
            List<Employee> g = employeeDao.findByFirstNameEndingWithAndBirthDateLessThan("i", date);
            System.out.println(g);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByFirstNameInOrBirthDateLessThanTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> names = new ArrayList<String>();
        names.add("Georgi");
        try {
            Date date = sdf.parse("2990-12-12");
            List<Employee> g = employeeDao.findByFirstNameInOrBirthDateLessThan(names, date);
            System.out.println(g);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByFirstNameInAndBirthDateLessThanTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<String> names = new ArrayList<String>();
        names.add("Georgi");
        names.add("Bezalel");
        names.add("Parto");
        try {
            Date date = sdf.parse("2990-12-12");
            List<Employee> g = employeeDao.findByFirstNameInAndBirthDateLessThan(names, date);
            System.out.println(g);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getEmployeeByMaxIdTest() {
        Employee employee = employeeDao.getEmployeeByMaxId();
        System.out.println(employee);
    }

    @Test
    public void queryParams1Test() {
        List<Employee> employees = employeeDao.queryParams1("Georgi", "M");
        System.out.println(employees);
    }

    @Test
    public void queryParams2Test() {
        List<Employee> employees = employeeDao.queryParams2("Georgi", "M");
        System.out.println(employees);
    }

    @Test
    public void queryLike1() {
//       Georgi
        List<Employee> employees = employeeDao.queryLike1("eorg");
        System.out.println(employees);
    }

    @Test
    public void queryLike2() {
        List<Employee> employees = employeeDao.queryLike2("a");
        System.out.println(employees);
    }

    @Test
    public void getCount() {
        long count = employeeDao.getCount();
        System.out.println(count);
    }


}
