package com.gradetracker.model;

import java.util.*;
import com.gradetracker.types.Name;

public record Course(Name name, List<Assignment> assignments){
    public void addAssignment(Assignment as){
        assignments.add(as);
    }
    public void removeAssignment(Assignment as){
        assignments.remove(as);
    }
    public void averageGrade(){

    }
}