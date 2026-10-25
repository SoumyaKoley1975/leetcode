// leetcode solution 1491 in java

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        double sum =0;
        for(int i = 1; i<n-1; i++){
            sum +=salary[i];
        }
        double avg = sum/(n-2);

        return avg;
        
    }
}

//soumya
