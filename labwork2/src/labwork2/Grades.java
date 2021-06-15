package labwork2;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
double grade;
double sumOfGrades;
int numStudents;
int numPass;
int numFail;
Scanner scan = new Scanner(System.in);
System.out.println("\nGrade processing program\n");
sumOfGrades = 0;
numStudents = 0;
numPass =0;
numFail =0;
System.out.println("Enter the first student's grade:");
grade = scan.nextDouble();
while(grade >=0) {
	sumOfGrades = sumOfGrades + grade;
	numStudents = numStudents + 1;
	if (grade < 60)
		numFail = numFail + 1;
	else 
		numPass = numPass + 1;
	System.out.println("Enter the next grdae (a negative to quit):");
	grade = scan.nextDouble();
}
if (numStudents > 0) {
	System.out.println("\nGrade Summary:");
	System.out.println("Class Average: "+sumOfGrades / numStudents);
	System.out.println("Number of passing Grades: " + numPass);
	System.out.println("Number of Failing Grades: "+numFail);
}
else
	System.out.println("No grades processed.");
}
	}


