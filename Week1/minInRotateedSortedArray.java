package Week1;

public  Static int  minInRotateedSortedArray {
    public static int findMin(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] > arr[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return arr[l];
    }
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
}

