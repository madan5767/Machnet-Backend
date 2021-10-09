package com.internship.ems.mapper;

import com.internship.ems.dto.ProjectDto;
import com.internship.ems.model.Project;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectMapper SALARY_MAPPER = Mappers.getMapper(ProjectMapper.class);

    ProjectDto modelToDto(Project project);

    List<ProjectDto> modelsToDtos(List<Project> projectList);

    @InheritInverseConfiguration
    Project dtoToModel(ProjectDto projectDto);
}
