package com.gradetracker.model;

import java.util.*;

import com.gradetracker.types.Grade;
import com.gradetracker.types.Name;

public class Course{
    private final Name name;
    private final List<Assignment> assignments;
    private Grade averageGrade;

    Course(Name name, List<Assignment> assignments){
        this.name = name;
        this.assignments = assignments;
        averageGrade = Grade.of();
    }
    public void addAssignment(Assignment as){
        assignments.add(as);
    }
    public void removeAssignment(Assignment as){
        assignments.remove(as);
    }
    public void recalculateAverage(){
        averageGrade.score(assignments.stream()
                .mapToDouble(a -> a.grade().score())
                .average()
                .orElseThrow(() -> new RuntimeException("Failure: averageGrade()"))
        );
    }
}