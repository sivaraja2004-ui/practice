class Solution {
    public int maxProductDifference(int[] nums) {
      Arrays.sort(nums);
      int mi=nums[0]*nums[1];
      int ma=nums[nums.length-1]*nums[nums.length-2];
      int r=ma-mi;
      return r;
    }
}