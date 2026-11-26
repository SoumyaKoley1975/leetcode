// leetcode 3360 in java 

class Solution {
    public boolean canAliceWin(int n) {
        int take =10, k=0;
        while(n >= take){
            n -= take;
            take--;
            k++;
        }
        return k%2 ==1;

    }
}

// soumya
