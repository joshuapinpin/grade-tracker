package com.gradetracker.types;

public class Score {
    private enum LetterGrade {

    }
    private double score;
    Score(double score) {
        score(score);
    }
    public void score(double score){this.score = score;}
    public double score(){return score;}


}
