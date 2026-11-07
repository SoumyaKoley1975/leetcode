// leetcode solution 4103 in java

class Solution {
    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
        int n = types.length;

        // stack to store [ types, colors, count-so-far]
        java.util.Stack<int[]> stack =new java.util.Stack<>();

        for(int i =0; i<n; i++){
            int t = types[i];
            int c = colors[i];
            if(!stack.isEmpty() && stack.peek()[0] == t && stack.peek()[1] == c){
                stack.peek()[2]++;
                if(stack.peek()[2] == groupSize[t]){
                    // reach the required group size , remove the element
                    
                    stack.pop();
                    
                }
                
            }
        else{
            // diffirent typr or color, or stack is empty.
            // a new group is start.
            if(groupSize[t] == 1){
                continue;
            }
            stack.push(new int[]{t, c, 1});
            
        }
        }
        return stack.isEmpty();
        
    }
}


// soumya
