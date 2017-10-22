package com.reige.dao;


import com.reige.domain.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

//如果不继承 Repository 可以使用 该注解
//@RepositoryDefinition(domainClass = Employee.class, idClass = Integer.class)
public interface EmployeeDao extends Repository<Employee, Integer> {

    Employee findByFirstName(String firstName);

    // where first_name like ?% and birth_date <?
    List<Employee> findByFirstNameStartingWithAndBirthDateLessThan(String firstName, Date birthDate);

    // where first_name like %? and birth_date <?
    List<Employee> findByFirstNameEndingWithAndBirthDateLessThan(String firstName, Date birthDate);

    // where first_name in (?,?....) or birth_date <?
    List<Employee> findByFirstNameInOrBirthDateLessThan(List<String> firstName, Date birthDate);

    // where first_name in (?,?....) and birth_date <?
    List<Employee> findByFirstNameInAndBirthDateLessThan(List<String> firstName, Date birthDate);

    @Query("select o from Employee o where id=(select max(id) from Employee t1)")
    Employee getEmployeeByMaxId();

    @Query("select o from Employee o where o.firstName=?1 and o.gender=?2")
    List<Employee> queryParams1(String firstName, String gender);

    @Query("select o from Employee o where o.firstName=:firstName and o.gender = :gender")
    List<Employee> queryParams2(@Param("firstName") String firstName, @Param("gender") String gender);

    @Query("select o from Employee o where o.firstName like %?1%")
    List<Employee> queryLike1(String firstName);

    //    both are right
    //    @Query("select o from Employee o where o.firstName like %:firstName%")
    @Query("select o from Employee o where o.firstName like concat('%',:firstName,'%')")
    List<Employee> queryLike2(@Param("firstName") String firstName);

    @Query(nativeQuery = true, value = "select count(1) from employee")
    long getCount();

    @Modifying
    @Query("update Employee o set o.gender = :gender where o.empNo = :id")
    void update(@Param("id") Integer id, @Param("gender") String gender);

}
