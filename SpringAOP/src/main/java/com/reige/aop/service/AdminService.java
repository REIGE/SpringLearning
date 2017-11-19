package com.reige.aop.service;

import com.reige.aop.annotation.AdminOnly;
import org.springframework.stereotype.Service;

/**
 * Created by REIGE on 2017/11/19.
 */
@Service
public class AdminService {

    @AdminOnly
    public void adminDoSomething() throws IllegalAccessException {
        System.out.println("adminDoSomething");
        throw new IllegalAccessException();
    }

}
