package com.internship.ems.listener;

import com.internship.ems.model.Department;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.persistence.*;

public class DepartmentListener {
    private static Log log = LogFactory.getLog(EmployeeListener.class);

    @PrePersist
    private void beforePost(Department department) {log.info("On processing to add a department");}

    @PreUpdate
    private void beforeUpdate(Department department) {
        log.info("On processing to update department " + department.getDepartmentID()
        );
    }

    @PreRemove
    private void beforeRemove(Department department) {
        log.info("On processing to delete department: " + department.getDepartmentID());
    }

    @PostPersist
    private void afterPost(Department department) {
        log.info("Add process completed for department: " + department.getDepartmentID());
    }

    @PostUpdate
    private void afterUpdate(Department department) {
        log.info("Update process completed for department: " + department.getDepartmentID());
    }

    @PostRemove
    private void afterRemove(Department department) {
        log.info("Delete process completed for department: " + department.getDepartmentID());
    }

    @PostLoad
    private void afterLoad(Department department) {
        log.info("Department loaded from database: " + department.getDepartmentID());
    }
}
