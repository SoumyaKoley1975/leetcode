// leetcode 127 solution 

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

                if (currentWord.equals(endWord)) {
                    return level;
                }

                for (int j = 0; j < currentWord.length(); j++) {
                    char[] charArray = currentWord.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = charArray[j];
                        charArray[j] = c;
                        String nextWord = new String(charArray);

                        if (wordSet.contains(nextWord)) {
                            wordSet.remove(nextWord);
                            queue.offer(nextWord);
                        }
                        charArray[j] = old;
                    }
                }
            }
            level++;
        }

        return 0;
    }
}

// soumya
