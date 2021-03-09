package apniKaksha;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of subjects:");
        int n = sc.nextInt();
        int marks[] = new int[n];


        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter the marks of subjects:");
            marks[i]=sc.nextInt();
        }

        int averageMarks = 0;

        for(int i=0; i<n; i++)
        {
            averageMarks += marks[i];
        }

        averageMarks /= n;

        System.out.println("The average marks of " + n + " subject is " + averageMarks);

    }
}
