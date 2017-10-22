package com.reige.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by REIGE on 2017/10/21.
 */
@Entity
@IdClass(SalariePK.class)
public class Salarie {
    private int empNo;
    private int salary;
    private Date fromDate;
    private Date toDate;

    @Id
    @Column(name = "emp_no")
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Id
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

        Salarie salarie = (Salarie) o;

        if (empNo != salarie.empNo) return false;
        if (salary != salarie.salary) return false;
        if (fromDate != null ? !fromDate.equals(salarie.fromDate) : salarie.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(salarie.toDate) : salarie.toDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo;
        result = 31 * result + salary;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }
}
