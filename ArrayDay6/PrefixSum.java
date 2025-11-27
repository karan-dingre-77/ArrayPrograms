package ArrayDay6;

public class PrefixSum {
    public static int[] prefixSum(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       int[] ans = prefixSum(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
