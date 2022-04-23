package Leetcode215;

class Solutions {
    public static void main(String[] args) {
        int []nums = new int[]{3,2,3,1,2,4,5,5,6};
        int k = 4;
        int so = new Solutions().findKthLargest(nums,k);
        System.out.println(so);
    }
    public int findKthLargest(int[] nums, int k) {
        int minIndex;
        for (int i=0;i<nums.length - 1;i++) {
            minIndex = i;
            for (int j=i+1; j<nums.length;j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            nums[minIndex] = nums[minIndex] ^ nums[i];
            nums[i] = nums[i] ^ nums[minIndex];
            nums[minIndex] = nums[minIndex] ^ nums[i];
            // int temp = nums[i];
            // nums[i] = nums[minIndex];
            // nums[minIndex] = temp;
        }
        int len = nums.length;
        return nums[len - k];
    }
}