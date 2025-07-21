 import java.util.*;


//naive approch -> tc : O(nlogn), sc : O(1)
  
 class minInRotatedSortedArray{
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMin(arr);
        System.out.println(result);
    }
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        return smallest;
    }
 }




//optimized approch -> tc : O(logn) , sc : o(1)

// class minInRotatedSortedArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int result = findMin(arr);
//         System.out.println(result);
//     }
//     public static int findMin(int[] nums) {
//         int n = nums.length;
//         int low = 0;
//         int high = n-1;

//         while(low < high){
//             int mid = low - ((low - high)/2);

//             if(nums[mid] >= nums[high]){
//                 low = mid + 1;
//             }
//             else{
//                 high = mid;
//             }
//         }
//         return nums[low];
//     }
// }


