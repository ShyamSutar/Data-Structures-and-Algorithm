package apniKaksha;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfTheNumbers
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Another type to add no. is string
        System.out.print("Enter the digits which you want to add:");
        int n = sc.nextInt();
       int temp =  n;  // because we want n after also
       int sum=0;
       while(temp>0)
       {
           int lastDigit = temp % 10;
                   temp /= 10;
           sum += lastDigit;
       }
        System.out.println("The sum of digits of " + n + " is " + sum);
    }
}
