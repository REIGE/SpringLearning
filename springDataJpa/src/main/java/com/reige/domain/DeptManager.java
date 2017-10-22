package com.reige.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by REIGE on 2017/10/21.
 */
@Entity
@Table(name = "dept_manager", schema = "spring_learning", catalog = "")
@IdClass(DeptManagerPK.class)
public class DeptManager {
    private String deptNo;
    private int empNo;
    private Date fromDate;
    private Date toDate;

    @Id
    @Column(name = "dept_no")
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Id
    @Column(name = "emp_no")
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "from_date")
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date")
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptManager that = (DeptManager) o;

        if (empNo != that.empNo) return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptNo != null ? deptNo.hashCode() : 0;
        result = 31 * result + empNo;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }
}
