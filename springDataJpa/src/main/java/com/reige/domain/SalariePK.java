package com.reige.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by REIGE on 2017/10/21.
 */
public class SalariePK implements Serializable {
    private int empNo;
    private Date fromDate;

    @Column(name = "emp_no")
    @Id
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Column(name = "from_date")
    @Id
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalariePK salariePK = (SalariePK) o;

        if (empNo != salariePK.empNo) return false;
        if (fromDate != null ? !fromDate.equals(salariePK.fromDate) : salariePK.fromDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        return result;
    }
}
