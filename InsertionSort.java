public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,4,3,7,8,3};
        for(int i=1;i<arr.length;i++){
            int crnt=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>crnt) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=crnt;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
        }
    }
}
