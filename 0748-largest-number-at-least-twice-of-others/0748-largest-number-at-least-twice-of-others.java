class Solution {
    public int dominantIndex(int[] nums) {
        int min=0,max=0,r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                r=i;
            }
        }
        int ck=max/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                continue;
            }
            if(max<nums[i]*2){
                return -1;
            }
        }
        return r;
    }
}