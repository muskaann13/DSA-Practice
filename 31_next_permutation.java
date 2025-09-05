// EASY EXPLANATION IN JUST 4 steps

// 1) Find the Pivot:
// Iterate from the end to find the first element that is smaller than the next element (nums[i] < nums[i + 1]).

// 2) Find the Successor:
// From the end, find the first element that is greater than nums[piv] (nums[j] > nums[piv]).

// 3) Swap
// Swap nums[piv] and nums[j].

// 4) Reverse the Tail:
// Reverse the subarray from i + 1 to the end to get the next smallest lexicographic permutation.

class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1;

        for(int i=nums.length-2; i>=0; i--) {
            if (nums[i] < nums[i+1]) {
                piv = i;
                break;
            }
        }

        if (piv == -1) {
            Arrays.sort(nums);
            return;
        }

        for (int i=nums.length-1; i>piv; i--) {
            if (nums[i] > nums[piv]) {
                swap (nums, i, piv);
                break;
            }
        }

        int left = piv+1;
        int right = nums.length-1;
        while (left <= right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}