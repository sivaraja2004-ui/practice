class Solution {
    public int findNumbers(int[] nums) {
        List<String>n=new ArrayList<>();
        for(int i:nums){
            if(String.valueOf(i).length()%2==0){
                n.add(String.valueOf(i));
            }
        }
        return n.size();
    }
}