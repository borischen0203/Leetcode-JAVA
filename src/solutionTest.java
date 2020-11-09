import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.event.ChangeEvent;

public class solutionTest {
    // n = 5 and a = [4, 0, 1, -2, 3],
    int[] mutateTheArray(int n, int[] a) {
        int[] result = new int[n];
        if (a.length == 1 || a.length == 0) {
            return a;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (i == 0) {
                    result[i] = a[i] + a[i + 1];
                } else if (i == a.length - 1) {
                    result[i] = a[i - 1] + a[i];
                } else {
                    result[i] = a[i - 1] + a[i] + a[i + 1];
                }
            }
            return result;
        }
    }

    long hashMap(String[] queryType, int[][] query) {
        long result = 0;
        int lastKey = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < query.length; i++) {
            String command = queryType[i];
            // // "insert", "insert", "addToValue", "addToKey", "get"
            switch (command) {
                case "insert":
                    // int[] keyValue = query[i];
                    // map.put(keyValue[0], keyValue[1]);
                    map.put(query[i][0], query[i][1]);
                    lastKey = query[i][0];
                    break;
                case "addToValue":
                    for (Integer key : map.keySet()) {
                        int value = map.get(key);
                        int addToValue = query[i][0];
                        map.put(key, value + addToValue);
                    }
                    break;
                case "addToKey":
                    HashMap<Integer, Integer> newMap = new HashMap<>();
                    for (Integer key : map.keySet()) {
                        int addToKey = query[i][0];
                        int newKey = key + addToKey;
                        int value = map.get(key);
                        newMap.put(newKey, value);
                        lastKey = newKey;
                    }
                    map = newMap;
                    break;
                case "get":
                    result = map.get(lastKey);
                    break;
            }
        }
        return result;

    }

    char firstNotRepeatingCharacter(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (map.containsKey(c)) {
        // map.put(c, map.get(c) + 1);
        // } else {
        // map.put(c, 1);
        // }
        // }
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (map.get(c) == 1) {
        // return c;
        // }
        // }
        // return '_';
        int[] counter = new int[26];

        for (char c : s.toCharArray())
            counter[c - 'a']++;

        for (char c : s.toCharArray()) {
            if (counter[c - 'a'] == 1)
                return c;
        }

        return '_';
    }

    int firstDuplicate(int[] a) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return a[i];
            } else {
                set.add(a[i]);
            }
        }
        return -1;
    }

    int[] ratingThreshold(double threshold, int[][] ratings) {
        ArrayList<Integer> tempResult = new ArrayList<>();
        if (ratings.length == 0 || ratings == null) {
            return new int[0];
        }
        for (int i = 0; i < ratings.length; i++) {
            if (average(ratings[i]) < threshold) {
                tempResult.add(i);
            }
        }
        int[] result = new int[tempResult.size()];
        for (int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }

    double average(int[] input) {
        double total = 0.0;
        for (int i = 0; i < input.length; i++) {
            total += input[i];
        }
        return total / input.length;
    }

    boolean nestedAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        boolean result = true;
        String[] s1 = s.split(" ");
        String[] t1 = t.split(" ");
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < t1.length; j++) {
                if (checkAnagram(s1[i], t1[j])) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
            if (result == false) {
                return false;
            }
        }
        return true;
    }

    boolean checkAnagram(String first, String second) {
        if (first.length() != second.length())
            return false;
        int[] alphabet = new int[26];
        for (int i = 0; i < first.length(); i++) {
            alphabet[first.charAt(i) - 97]++;
            alphabet[second.charAt(i) - 97]++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] % 2 != 0) {
                return false;
            }
        }
        return true;

    }
    // crypt = ["SEND", "MORE", "MONEY"] and

    // solution = [['O', '0'],
    // ['M', '1'],
    // ['Y', '2'],
    // ['E', '5'],
    // ['N', '6'],
    // ['D', '7'],
    // ['R', '8'],
    // ['S', '9']]

    boolean isCryptSolution(String[] crypt, char[][] solution) {
        BigInteger firstword, secondWord, totalWord;
        for (char[] chars : solution) {
            crypt[0] = crypt[0].replace(chars[0], chars[1]);
            crypt[1] = crypt[1].replace(chars[0], chars[1]);
            crypt[2] = crypt[2].replace(chars[0], chars[1]);
            System.out.println("words: " + crypt[0] + " " + crypt[1] + " " + crypt[2]);
        }
        firstword = new BigInteger(crypt[0]);
        secondWord = new BigInteger(crypt[1]);
        totalWord = new BigInteger(crypt[2]);
        if ((crypt[0].startsWith("0") && crypt[0].length() != 1) || (crypt[1].startsWith("0") && crypt[1].length() != 1)
                || (crypt[2].startsWith("0") && crypt[2].length() != 1))
            return false;
        return (firstword.add(secondWord).equals(totalWord));
    }
    // Map<Character, Character> map = new HashMap<>();
    // for (char[] c : solution) {
    // map.put(c[0], c[1]);
    // }
    // for (int j = 0; j < crypt.length; j++) {
    // String s = crypt[j];
    // for (int i = 0; i < s.length(); i++) {
    // char key = s.charAt(i);
    // char value = map.get(s.charAt(i));
    // if (i == 0 && value == '0') {
    // return false;
    // }
    // crypt[j] = crypt[j].replace(key, value);
    // }
    // }

    // // BigInteger a = Integer.valueOf(crypt[0]);
    // BigInteger a = new BigInteger(crypt[0]);
    // BigInteger b = new BigInteger(crypt[1]);
    // BigInteger c = new BigInteger(crypt[2]);

    // if (a + b == c) {
    // return true;
    // } else {
    // return false;
    // }
    int binaryPatternMatching(String pattern, String s) {
        int result = 0;
        if (pattern.length() > s.length()) {
            return 0;
        }
        Set<Character> vowel = new HashSet<Character>();
        vowel.addAll(Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u', 'y' }));
        boolean[] p1 = new boolean[pattern.length()];
        boolean[] s1 = new boolean[s.length()];
        for (int i = 0; i < s1.length; i++) {// s =amazing
            if (vowel.contains(s.charAt(i))) {
                s1[i] = true;
            } else {
                s1[i] = false;
            }
        }
        for (int i = 0; i < p1.length; i++) {// pattern = 010
            if (pattern.charAt(i) == '0') {
                p1[i] = true;
            } else {
                p1[i] = false;
            }
        }
        for (int i = 0; i + p1.length <= s1.length; i++) {

        }

        // for (int i = 0; i + pattern.length() <= s.length(); i++) {
        // for (int j = 0; j < pattern.length(); j++) {
        // if(s.charAt(j)){

        // }
        // }
        // }
        return result;
    }

    public static void main(String[] args) {
        solutionTest s = new solutionTest();
        // String[] crypt = new String[] { "SEND", "MORE", "MONEY" };
        // char[][] solution = new char[][] { { 'O', '0' }, { 'M', '1' }, { 'Y', '2' },
        // { 'E', '5' }, { 'N', '6' },
        // { 'D', '7' }, { 'R', '8' }, { 'S', '9' } };
        String[] crypt = new String[] { "AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC" };
        char[][] solution = new char[][] { { 'A', '1' }, { 'B', '2' }, { 'C', '3' } };

        System.out.println(s.isCryptSolution(crypt, solution));
    }
}