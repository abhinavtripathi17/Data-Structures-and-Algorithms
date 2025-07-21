import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class subArraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int [n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        // int count = solve1(arr, k);
        int count = solve2(arr , k);
        
        System.out.println(count);

    }
    
    //naive approch -> tc : O(n^2) , sc : O(1);
    // public static int solve1(int nums[] , int k){
    //     int cnt = 0;
    //     int n = nums.length;

    //     for(int i = 0 ; i < n ; i++){
    //         int sum = 0;
    //         for(int j = i ; j < n ; j++){
    //             sum += nums[j];
    //             if(sum == k){
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }


    //optimal approch -> tc : O(n) , sc : O(n)
    public static int solve2(int nums[] , int k){
        int n = nums.length;
        int count = 0;
        Map<Integer , Integer>mpp = new HashMap<>();
        mpp.put(0 , 1);
        int r = 0;
        int sum = 0;
        while(r < n){
            sum += nums[r];

            if(mpp.containsKey(sum - k)){
                count += mpp.get(sum - k);
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
            r++;
        }
        return count;
    }
    
}
