import java.util.*;

class minInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMin(arr);
        System.out.println("Minimum element is: " + result);
    }
    public static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low < high){
            int mid = low - ((low - high)/2);

            if(nums[mid] >= nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}


