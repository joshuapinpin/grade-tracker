package com.gradetracker.types;

public class Grade {
    private double score;
    private Grade(double score) {
        score(score);
    }
    public static Grade of(){return new Grade(0);}
    public void score(double score){this.score = score;}
    public double score(){return score;}


}
