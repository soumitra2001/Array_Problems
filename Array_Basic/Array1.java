package Array_Basic;
import java.util.Scanner;

public class Array1{
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
   
        }
        System.out.println("Enter the diff:");
        int K=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]-arr[j]==K || arr[i]-arr[j]==-K){
                    count=count+1;
                }
            }
        }
        System.out.println(count);

    }
}