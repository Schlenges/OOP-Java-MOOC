/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class GradeDistribution {
    private int[] grades;
 
    public GradeDistribution() {
        grades = new int[6];
    }
 
    public void addAScore(int score) {
        if (score < 0 || score > 60) {
            return;
        }
 
        int grade = grading(score);
        
        grades[grade]++;
    }
 
    public void print() {
        System.out.println("Grade distribution:");
        
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + distribution(grades[i]));
        }
 
        System.out.println("Acceptance percentage: " + acceptancePercentage());
    }
 
    private String distribution(int n) {
        String line = "";
        
        for (int i = 0; i < n; i++) {
            line += "*";
        }
        return line;
    }
 
    private int grading(int score) {
 
        if (score < 30) {
            return 0;
        }
        if (score < 35) {
            return 1;
        }
        if (score < 40) {
            return 2;
        }
        if (score < 45) {
            return 3;
        }
        if (score < 50) {
            return 4;
        }
 
        return 5;
    }
 
    private double acceptancePercentage() {
        double all = 0;
        
        for (int number : grades) {
            all += number;
        }
        
        double failed= grades[0];
 
        return 100 * (all - failed) / all;
    }
}
