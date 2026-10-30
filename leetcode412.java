// leetcode solution 412 in java 
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> game = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%15 == 0){
                game.add("FizzBuzz");
                continue;
            }
            else if(i%3 == 0){
                game.add("Fizz");
                continue;
            }
            else if(i%5 == 0){
                game.add("Buzz");
                continue;
            }
            else{
                game.add(String.valueOf(i));
                continue;
            }

        }
        return game;
        
    }
}
// soumya
