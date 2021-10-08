package com.internship.ems.listener;

import com.internship.ems.model.Salary;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.*;

public class SalaryListener {
    private static Log log = LogFactory.getLog(EmployeeListener.class);

    @PrePersist
    private void beforePost(Salary salary) {
        log.info("On processing to add an salary");
    }

    @PreUpdate
    private void beforeUpdate(Salary salary) {
        log.info("On processing to update salary: " + salary.getSalaryID());
    }

    @PreRemove
    private void beforeRemove(Salary salary) {
        log.info("On processing to delete salary: " + salary.getSalaryID());
    }

    @PostPersist
    private void afterPost(Salary salary) {
        log.info("Add process completed for salary: " + salary.getSalaryID());
    }

    @PostUpdate
    private void afterUpdate(Salary salary) {
        log.info("Update process completed for salary: " + salary.getSalaryID());
    }

    @PostRemove
    private void afterRemove(Salary salary) {
        log.info("Delete process completed for salary: " + salary.getSalaryID());
    }

    @PostLoad
    private void afterLoad(Salary salary) {
        log.info("Salary loaded from database: " + salary.getSalaryID());
    }
}
