package com.reige.service;

import com.reige.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by REIGE on 2017/10/22.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    @Override
    @Transactional("transactionManager")
    public void update(Integer id, String gender) {
        employeeDao.update(id, gender);
    }
}
