package medium.letterCombinationsPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    //Todo :: MAP

    Map<Character, List<Character>> possibleLetters;
    public List<String> letterCombinations(String digits) {
        // gotta use recursion fo-sho.

        possibleLetters = new HashMap<>();
        possibleLetters.put('2', List.of('a','b','c'));
        possibleLetters.put('3', List.of('d','e','f'));
        possibleLetters.put('4', List.of('g','h','i'));
        possibleLetters.put('5', List.of('j','k','l'));
        possibleLetters.put('6', List.of('m','n','o'));
        possibleLetters.put('7', List.of('p','q','r', 's'));
        possibleLetters.put('8', List.of('t','u','v'));
        possibleLetters.put('9', List.of('w','x','y', 'z'));

        List<String> retList = new ArrayList<>();
        letterCombinations(digits, 0, new StringBuilder(), retList);

        return retList;
    }

    private void letterCombinations(String digits, int index, StringBuilder currWord, List<String> currList) {
        if (index == digits.length()) {
            currList.add(currWord.toString());
            return;
        }

        char currDigit = digits.charAt(index);

        List<Character> possibleChars = possibleLetters.get(currDigit);

        for (Character c : possibleChars) {
            currWord.append(c);
            letterCombinations(digits, index + 1, currWord, currList);
            currWord.deleteCharAt(index);
        }

    }
}