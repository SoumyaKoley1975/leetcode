// leetcode solution 1672 in java 

class Solution {
    public int sum(int[] arr){
        int addition = 0;
        for(int i = 0; i <arr.length; i++){
            addition += arr[i];

        }
        return addition ;
    }
    public int maximumWealth(int[][] accounts) {
        int [] amount = new int[accounts.length];
        for(int i =0 ; i < accounts.length;i++){
            amount[i] = sum(accounts[i]);

        }
        Arrays.sort(amount);
        int high = amount[accounts.length-1];

        return high ;
    }
}

// soumya
