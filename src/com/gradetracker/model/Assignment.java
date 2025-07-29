package com.gradetracker.model;
import com.gradetracker.types.Name;
import com.gradetracker.types.Score;
import com.gradetracker.types.Weight;

public record Assignment(Name name, Weight weight, Score score) {}
