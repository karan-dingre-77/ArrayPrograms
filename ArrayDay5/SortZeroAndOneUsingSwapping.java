package ArrayDay5;

public class SortZeroAndOneUsingSwapping {

    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void retArr(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0,1,1,0};
        retArr(arr);
        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
