// 1)Bubble Sorting for 1-D Array=>    [ Ascending Order of Integer Number  ] 
/*import java.util.*;
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr=new int[]{2,6,12,9,32,823};
        int temp=0,flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // Or we can write it using for-each loop--
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
} */

// 2)Bubble Sorting for 1-D Array=>   [   lexicographical Ascending order of String   ]
public class BubbleSort{
    public static void main(String[] args) {
        String[] str={"supriya","sup","priya","riya","iyas"};
        String temp="";
        int flag=0;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-i-1;j++){
                if(str[j].compareTo(str[j+1])>0){
                    temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                    flag=1;
                }
                if(flag==0){
                    break;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}