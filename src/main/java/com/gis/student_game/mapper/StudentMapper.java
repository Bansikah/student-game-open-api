package com.gis.student_game.mapper;

import com.gis.student_game.domain.StudentEntity;
import com.gis.student_game.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class StudentMapper {
    public abstract StudentEntity toEntity(Student student);
    public abstract Student toModel(StudentEntity studentEntity);
}