package com.gis.student_game.business_logic;

import com.gis.student_game.model.Student;
import com.gis.student_game.model.StudentMean;

@FunctionalInterface
public interface Operation {

    void operate(Student student, StudentMean mean);

}
