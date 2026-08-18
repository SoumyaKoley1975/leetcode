// leetcode 228
// don,t follow this method 
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new ArrayList<>();
        if(nums.length == 1){
            range.add(String.valueOf(nums[0]));
            return range;
        }
        int[] arr = new int[nums.length +1];

        for(int i =0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        
        int i = 0;
        while(i<arr.length-1){
            int a = arr[i];
            int b =arr[i+1];

            if(a+1==b){
                
                while(arr[i+1]-arr[i]==1){
                    i++;
                }
                range.add(a+"->"+arr[i]);

            }
            else{
                range.add(String.valueOf(a));
            }
            i++;
        }
        return range; 
        
    }
}