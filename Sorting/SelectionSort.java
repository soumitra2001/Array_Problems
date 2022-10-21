// 1)Selection Sort for 1-D array   [Ascending Order of Integer Number]
/*public class SelectionSort {
    public static void main(String[] args) {
        int[] A={12,6,45,9,32,5};
        int min,temp=0;
        for(int i=0;i<A.length;i++){
            min=i;
            for(int j=i+1;j<A.length;j++){
                if(A[min]>A[j]){
                    min=j;
                }
            }
            temp=A[i];
            A[i]=A[min];
            A[min]=temp;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
} */

// 2)Selection sort for 1-D array   [   lexicographical Ascending order of String  ]
public class SelectionSort{
    public static void main(String[] args) {
        String[] st={"ram","sum","jum","hum","tum","pum"};
        String temp="";
        int min;
        for(int i=0;i<st.length;i++){
            min=i;
            for(int j=i+1;j<st.length;j++){
                if(st[min].compareTo(st[j])>0){
                    min=j;
                }
            }
            temp=st[i];
            st[i]=st[min];
            st[min]=temp;
        }
        for(int i=0;i<st.length;i++){
            System.out.print(st[i]+" ");
        }
    }
}
