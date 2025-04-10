class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    ans.add(arr);
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                    j++;
                }
                }
                else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}