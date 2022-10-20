package Array_Basic;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 2;
        int arr[] = { 3, 4, 5 };
        for (int i = 0; i < k; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {

                arr[j] = arr[j - 1];

            }
            arr[0] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}