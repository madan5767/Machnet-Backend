package com.internship.ems.dao;

import com.internship.ems.model.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SalaryRepository extends JpaRepository<Salary,Integer>{

}