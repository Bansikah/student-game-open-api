package com.gis.student_game.business_logic;

import com.gis.student_game.model.Student;
import com.gis.student_game.model.StudentMean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogOperation implements Operation{

    @Override
    public void operate(Student student, StudentMean mean) {
        log.info("Student {} mean is {}", student.getId(), mean);
    }
}
