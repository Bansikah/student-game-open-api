package com.gis.student_game.rest;

import com.gis.student_game.api.MeanApiDelegate;
import com.gis.student_game.model.Mean;
import com.gis.student_game.model.StudentMean;
import com.gis.student_game.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MeanApiDelegateImpl implements MeanApiDelegate {
    private final StudentService studentService;

    @Override
    public void addStudentMean(String studentId, StudentMean studentMean) {
        studentService.addStudentMean(studentId, studentMean);
    }

    @Override
    public Mean getAllStudentMean() {
        return studentService.getAllStudentMean();
    }

    @Override
    public StudentMean getStudentMean(String studentId) {
        return studentService.getStudentMean(studentId);
    }
}
