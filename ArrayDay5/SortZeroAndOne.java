package ArrayDay5;

public class SortZeroAndOne {
    static void countZero(int[] arr){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                cnt++;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(j<cnt){
                arr[j] = 0;
            }else{
                arr[j] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,0};
        countZero(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
