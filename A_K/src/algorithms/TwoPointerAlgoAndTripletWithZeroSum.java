package algorithms;
import java.util.*;
public class TwoPointerAlgoAndTripletWithZeroSum
{

    static boolean findTriplets(int arr[], int n)
    {
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++)
        {
            if(twoSum(arr,-arr[i],i+1))
            {   return true;
            }
        }
        return false;
    }

    static boolean twoSum(int a[],int x,int i)
    {
        int j=a.length-1;

        while(i<j)
        {
            if(a[i] + a[j] > x)
            {
                System.out.println("not a triplet whose sum is zero");
                j--;
            }
            else if(a[i] + a[j] < x)
            {System.out.println("not a triplet whose sum is zero");
                i++;
            }
            else  if(a[i] + a[j] < x)
            {
                System.out.println("It is a triplet whose sum is zero");
//                System.out.print(a[i] + " ");
//                System.out.print(a[j] + " ");
//                System.out.println([x]);

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {-4, -1, 0, 2, 3, 3, 4};
        int n = arr.length;
        findTriplets(arr, n);
    }
}
