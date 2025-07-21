Ques1 -> Min In Rotated Sorted Array

Naive Approch:

1. sort the given array.
2. first element of the sorted array will be always smallest.
3. return that element.
TC -> O(nlogn) SC -> o(1);

Optimal Approch: 

1. This can be done using Binary Search:
2. Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index and high will point to the last index.
3. Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
mid = (low+high) // 2.
4. Identify the sorted half, and after picking the leftmost element, eliminate that half.
-> If arr[low] <= arr[mid]: This condition ensures that the left part is sorted. So, we will pick the leftmost element i.e. arr[low]. Now, we will compare it with 'ans' and update 'ans' with the smaller value (i.e., min(ans, arr[low])). Now, we will eliminate this left half(i.e. low = mid+1).
-> Otherwise, if the right half is sorted:  This condition ensures that the right half is sorted. So, we will pick the leftmost element i.e. arr[mid]. Now, we will compare it with 'ans' and update 'ans' with the smaller value (i.e., min(ans, arr[mid])). Now, we will eliminate this right half(i.e. high = mid-1).
5. This process will be inside a loop and the loop will continue until low crosses high. Finally, we will return the ‘ans’ variable that stores the minimum element.
Tc -> O(logn) , SC -> O(1);



<------------------------------------------------------------------------------------------------------------------------------------------------->
Ques2 -> SubArray sum equals k

Naive Approch:
1. First, we will run a loop(say i) that will select every possible starting index of the subarray. The possible starting indices can vary from index 0 to index n-1(n = size of the array).
2. Inside the loop, we will run another loop(say j) that will signify the ending index of the subarray. For every subarray starting from the index i, the possible ending index can vary from index i to n-1(n = size of the array).
3. After that for each subarray starting from index i and ending at index j (i.e. arr[i….j]), we will run another loop to calculate the sum of all the elements(of that particular subarray).
4. After calculating the sum, we will check if the sum is equal to the given k. If it is, we will increase the value of the count.
TC -> O(n^2) , SC -> O(1);

Optimal Approch:
1. Declare a variable right that will go till the end of the array, declare a variable sum , and cnt to count the subarrays. 
2. Declare a HashMap that will use to check if sum == k.
3. Iterate through the array using a single pointer r , for each element, add it to the current prefix sum.
4. heck if sum - k exists in the map , this means there is a subarray ending at index r whose sum is k ,if it exists, add the frequency of (sum - k) to count.
5. Update the map with the current prefix sum , increase the frequency of sum by 1 using getOrDefault.
6. Return count after the loop ends.
TC -> O(n) , SC -> O(n);
