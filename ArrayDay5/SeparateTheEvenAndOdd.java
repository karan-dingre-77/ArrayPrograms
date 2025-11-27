package ArrayDay5;

public class SeparateTheEvenAndOdd{
    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
public static void findEAO(int[] arr){
    int left = 0;
    int right = arr.length-1;
    while(left<right){
        if((arr[left] % 2 != 0) && (arr[right] % 2 == 0)){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left] % 2 == 0){
            left++;
        }
        if(arr[left] % 2 != 0){
            right--;
        }
    }
}
   public static void main(String[] args){
       int[] arr = {1,3,2,4,6,5,8,7,9};
       findEAO(arr);
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
       }
    }
}
