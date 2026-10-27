import java.util.*;

class Solution {
    int[] result;
    int[] indices;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        result = new int[n];
        indices = new int[n];
        
        // Initialize an array to track the original indices of the elements
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // Perform modified merge sort
        mergeSort(nums, 0, n - 1);
        
        // Convert the result array to the requested List format
        List<Integer> ans = new ArrayList<>();
        for (int count : result) {
            ans.add(count);
        }
        return ans;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] tempIndices = new int[right - left + 1];
        int i = left;     // Pointer for left subarray
        int j = mid + 1;  // Pointer for right subarray
        int k = 0;
        int rightCount = 0; // Tracks how many elements from the right side jumped ahead

        while (i <= mid && j <= right) {
            // If the element in the right subarray is strictly smaller
            if (nums[indices[j]] < nums[indices[i]]) {
                rightCount++; 
                tempIndices[k++] = indices[j++];
            } else {
                // When the left element is placed, it is larger than all right elements 
                // that jumped ahead of it so far.
                result[indices[i]] += rightCount;
                tempIndices[k++] = indices[i++];
            }
        }

        // Clean up remaining elements in the left subarray
        while (i <= mid) {
            result[indices[i]] += rightCount;
            tempIndices[k++] = indices[i++];
        }

        // Clean up remaining elements in the right subarray
        while (j <= right) {
            tempIndices[k++] = indices[j++];
        }

        // Copy back the sorted indices into the original tracking array
        System.arraycopy(tempIndices, 0, indices, left, tempIndices.length);
    }
}
