package me.chris;

import java.util.Scanner;

public class GradeBookTest {
	// main method begins program execution
	public static void main(String[] args) {
		// two-dimensional array of student grades
		int[][] gradesArray = { { 87, 96, 70 }, { 68, 87, 90 }, { 94, 100, 90 }, { 100, 81, 82 }, { 83, 65, 85 },
				{ 78, 87, 65 }, { 85, 75, 83 }, { 91, 94, 100 }, { 76, 72, 84 }, { 87, 93, 73 } };

		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", 10, 3);
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a student number to add an exam grade to, -1 to quit");
			int student = scanner.nextInt();
			if (student == -1) {
				break;
			} else {
				System.out.println("Enter an exam number to add an exam grade to, -1 to quit");
				int exam = scanner.nextInt();
				if (exam == -1) {
					break;
				} else {
					System.out.println("Enter an exam grade to add to exam: " + exam + ", -1 to quit");
					int grade = scanner.nextInt();
					if (grade == -1) {
						break;
					} else {
						myGradeBook.setGrade(student, exam, grade);
					}
				}
			}
		}

		myGradeBook.processGrades();
		scanner.close();
	}
} // end class GradeBookTest

/*
 * Welcome to the grade book for
CS101 Introduction to Java Programming

Enter a student number to add an exam grade to, -1 to quit
1
Enter an exam number to add an exam grade to, -1 to quit
1
Enter an exam grade to add to exam: 1, -1 to quit
87
Enter a student number to add an exam grade to, -1 to quit
1
Enter an exam number to add an exam grade to, -1 to quit
2
Enter an exam grade to add to exam: 2, -1 to quit
96
Enter a student number to add an exam grade to, -1 to quit
1
Enter an exam number to add an exam grade to, -1 to quit
3
Enter an exam grade to add to exam: 3, -1 to quit
70
Enter a student number to add an exam grade to, -1 to quit
2
Enter an exam number to add an exam grade to, -1 to quit
1
Enter an exam grade to add to exam: 1, -1 to quit
68
Enter a student number to add an exam grade to, -1 to quit
2
Enter an exam number to add an exam grade to, -1 to quit
2
Enter an exam grade to add to exam: 2, -1 to quit
87
Enter a student number to add an exam grade to, -1 to quit
2
Enter an exam number to add an exam grade to, -1 to quit
3
Enter an exam grade to add to exam: 3, -1 to quit
90
Enter a student number to add an exam grade to, -1 to quit
3
Enter an exam number to add an exam grade to, -1 to quit
1
Enter an exam grade to add to exam: 1, -1 to quit
94
Enter a student number to add an exam grade to, -1 to quit
3
Enter an exam number to add an exam grade to, -1 to quit
2
Enter an exam grade to add to exam: 2, -1 to quit
100
Enter a student number to add an exam grade to, -1 to quit
2
Enter an exam number to add an exam grade to, -1 to quit
-1
The grades are:

            Test 1  Test 2  Test 3  Average
Student  1      87      96      70    84.33
Student  2      68      87      90    81.67
Student  3      94     100      -1    64.33
Student  4      -1      -1      -1    -1.00
Student  5      -1      -1      -1    -1.00
Student  6      -1      -1      -1    -1.00
Student  7      -1      -1      -1    -1.00
Student  8      -1      -1      -1    -1.00
Student  9      -1      -1      -1    -1.00
Student 10      -1      -1      -1    -1.00

Lowest grade in the grade book is -1
Highest grade in the grade book is 100

Overall grade distribution:
00-09: **********************
10-19: 
20-29: 
30-39: 
40-49: 
50-59: 
60-69: *
70-79: *
80-89: **
90-99: ***
  100: *
  */
