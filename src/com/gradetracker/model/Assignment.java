package com.gradetracker.model;
import com.gradetracker.types.Name;
import com.gradetracker.types.Grade;
import com.gradetracker.types.Weight;

public record Assignment(Name name, Weight weight, Grade grade) {}
