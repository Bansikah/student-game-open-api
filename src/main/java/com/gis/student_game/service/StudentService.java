package com.gis.student_game.service;

import com.gis.student_game.business_logic.Operation;
import com.gis.student_game.domain.StudentEntity;
import com.gis.student_game.mapper.StudentMapper;
import com.gis.student_game.model.Mean;
import com.gis.student_game.model.Student;
import com.gis.student_game.model.StudentMean;
import com.gis.student_game.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final List<Operation> operations;
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    public void addStudentMean(String studentId, StudentMean studentMean) {
        var student = getStudentEntity(studentId);
        operations.forEach(operation -> operation.operate(student, studentMean));
    }

    public Mean getAllStudentMean() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public StudentMean getStudentMean(String studentId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private Student getStudentEntity(String studentId) {
        var found = studentRepo.getReferenceById(studentId);
        return studentMapper.toModel(found);
    }
}
