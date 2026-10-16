// leetcode solution 322

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        // Initialize the DP table with a value greater than any possible solution
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        
        // Base case: 0 coins are needed to make an amount of 0
        dp[0] = 0;
        
        // Compute the minimum coins for every amount up to the target
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        // If dp[amount] wasn't updated, the amount cannot be made
        return dp[amount] > amount ? -1 : dp[amount];
    }
}


// soumya

/*
This code is a classic Dynamic Programming (DP) solution to the **Coin Change** problem. The goal is to find the minimum number of coins needed to make up a specific target `amount`.

Here is the step-by-step breakdown of how the code operates.

## 1. Array Initialization

```java
int max = amount + 1;
int[] dp = new int[amount + 1];
Arrays.fill(dp, max);

```

* **`dp` Array Setup:** An array named `dp` is created with a size of `amount + 1`. This array will store the minimum number of coins needed for every sub-amount from `0` up to the target `amount`. (e.g., if target is 11, the array has 12 slots for amounts 0 through 11).
* **Dummy "Infinity" Value:** The variable `max` is set to `amount + 1`. Since the worst-case scenario is using all coins of value `1`, the maximum possible number of coins you could ever need is exactly `amount`. Therefore, `amount + 1` acts as a safe "infinity" or "impossible" marker.
* **Filling the Array:** `Arrays.fill` initializes every slot in the `dp` array with this dummy infinity value.

## 2. Base Case

```java
dp[0] = 0;

```

* To make an amount of `0`, you need exactly `0` coins. This serves as the foundational starting point for all subsequent calculations.

## 3. The Outer Loop (Building Up Amounts)

```java
for (int i = 1; i <= amount; i++) {

```

* This loop systematically calculates the answer for every sub-amount from `1` all the way up to the target `amount`. This is the core of the **bottom-up DP approach**: by solving for smaller amounts first, the program can use those known answers to solve for larger amounts.

## 4. The Inner Loop (Testing Each Coin)

```java
    for (int coin : coins) {

```

* For the current target sub-amount `i`, this loop checks every available coin denomination provided in the `coins` array.

## 5. The State Transition (Updating the DP Table)

```java
        if (i - coin >= 0) {
            dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }

```

* **The Check:** `i - coin >= 0` ensures that the current coin is not larger than the amount `i` you are trying to make. If the coin is larger, it cannot be used.
* **The Math:** If the coin is valid, the code looks back at the DP table. `dp[i - coin]` gives the minimum number of coins needed to make the *remaining* amount after using this specific coin.
* **The Update:** It adds `1` (representing the current coin) to that remainder (`dp[i - coin] + 1`). It then compares this new total to the current best answer stored in `dp[i]`. `Math.min` ensures that `dp[i]` always holds the absolute lowest number of coins found so far for amount `i`.

## 6. The Final Check and Return

```java
return dp[amount] > amount ? -1 : dp[amount];

```

* Once the loops finish, the final answer for the target amount is sitting in `dp[amount]`.
* If `dp[amount]` is still greater than `amount` (meaning it still holds that initial dummy `max` value), it means no combination of coins could possibly form the target amount. The ternary operator catches this and returns `-1`.
* Otherwise, it returns the calculated integer value stored in `dp[amount]`.

---

## Complexity Analysis

* **Time Complexity: $O(S \times n)$**
Where $S$ is the `amount` and $n$ is the number of coin denominations. The outer loop runs $S$ times, and for each iteration, the inner loop runs $n$ times.
* **Space Complexity: $O(S)$**
The extra space used is entirely for the `dp` array, which scales linearly with the target `amount`.
 */