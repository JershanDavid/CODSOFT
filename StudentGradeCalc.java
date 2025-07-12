import java.util.Scanner;



public class StudentGradeCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Subjects : ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        for(int i = 0;i < numSubjects;i++){
            System.out.println("Enter marks for subjects " + (i + 1) + " (out of 100) : ");
            marks[i] = sc.nextInt();
            while(marks[i] < 0 || marks[i] > 100){
                System.out.println("Invalid marks. Please enter again (0-100) : ");
                marks[i] = sc.nextInt();
            }
            totalMarks += marks[i];
        }
        double avgPercent = (double)totalMarks/numSubjects;
        char grade;
        if(avgPercent >= 90){
            grade = 'A';
        }else if(avgPercent >= 80 && avgPercent < 90){
            grade = 'B';
        }else if(avgPercent >= 70 && avgPercent < 80){
            grade = 'C';
        }else if(avgPercent >= 60 && avgPercent < 70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("\n******* RESULT *******");
        System.out.println("Total marks : " + totalMarks);
        System.out.printf("Average Percentge :  + %.2f%%\n", avgPercent);
        System.out.println("Grade : " + grade);
        sc.close();
    }
}
