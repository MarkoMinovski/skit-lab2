package com.skit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    /**

     * Analyzes an array of student grades.
     * Returns a summary message based on:
     * - Number of passing grades (>= 50)
     * - If any grade is invalid (< 0 or > 100)
     * - If all students passed
     *
     * @param grades an array of integers representing student grades
     * @return summary message
     */
    public static String analyzeGrades(int[] grades) {
        boolean hasInvalid = false;
        int passCount = 0;

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];

            if (grade < 0 || grade > 100) {
                hasInvalid = true;
            } else if (grade >= 50) {
                passCount++;
            }
        }

        if (hasInvalid) {
            return "Invalid grades detected.";
        } else if (passCount == grades.length && grades.length > 0) {
            return "All students passed.";
        } else if (passCount == 0) {
            return "No students passed.";
        } else {
            return "Some students passed.";
        }
    }

    public static void main(String[] args) {
        int[] grades = {3, 6, 3, 1, 11, 2};
        System.out.print(analyzeGrades(grades));
    }
}