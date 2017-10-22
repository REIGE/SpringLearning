package com.reige.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by REIGE on 2017/10/21.
 */
public class DeptManagerPK implements Serializable {
    private String deptNo;
    private int empNo;

    @Column(name = "dept_no")
    @Id
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Column(name = "emp_no")
    @Id
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptManagerPK that = (DeptManagerPK) o;

        if (empNo != that.empNo) return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptNo != null ? deptNo.hashCode() : 0;
        result = 31 * result + empNo;
        return result;
    }
}
