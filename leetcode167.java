// leetcode problem 167

// leetcode solution 

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ind = new int[2];
        int count =0;
        for(int i=0;i<numbers.length-1;i++){
            if(count ==0){
            for(int j=i+1;j<numbers.length;j++){
                
                if(numbers[i]+numbers[j]==target){
                    ind[0]=i+1;
                    ind[1]=j+1;
                    count++;
                }
                }
                
            }
        }
        return ind;
    }
}