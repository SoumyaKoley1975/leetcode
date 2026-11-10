// leetcode solution 1394 in java

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLuckyNum = -1;
        for (int num : arr){
            int frequency = map.getOrDefault(num,0);
            map.put(num,frequency + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            if (key == entry.getValue()) {
            maxLuckyNum = key;
            }
        }
        return maxLuckyNum;
    }
}

// soumya
