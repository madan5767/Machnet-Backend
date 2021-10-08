package com.internship.ems.mapper;

import com.internship.ems.dto.EmployeeDto;
import com.internship.ems.model.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

//@Mapper(imports = UUID.class) //automatic conversion of Data types from model to dto types.
@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

//    @Mapping(target="employee_id", expression = "java(UUID.randomUUID().toString())")
    EmployeeDto modelTODto(Employee employee);
    @InheritInverseConfiguration
    Employee dtoToModel(EmployeeDto employeeDto);
}
