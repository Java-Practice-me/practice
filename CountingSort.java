/**
 * CountingSort
 */
public class CountingSort {

    public static void main(String[] args) {
        int arr[]={1,2,3,9,4,3,7,8,3};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int countArr[]=new int [largest+1];
        for(int i=0;i<arr.length;i++){
            countArr[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<countArr.length;i++){
            while (countArr[i]>0) {
               arr[j] =i;
               j++;
               countArr[i]--; 
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
        }
    }
}