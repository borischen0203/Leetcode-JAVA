import java.util.*;
import java.util.Map.Entry;

public class solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<String>(Arrays.asList(banned));
        Map<String, Integer> dic = new TreeMap<String, Integer>();
        int maxValue = 0;
        String[] tokens = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        // split("[\\p{Punct}\\s]+")

        for (String a : tokens) {
            if (!ban.contains(a)) {
                if (!dic.containsKey(a)) {
                    dic.put(a, 1);
                } else {
                    dic.put(a, dic.get(a) + 1);

                }
                int b = dic.get(a).intValue();
                if (b > maxValue) {
                    maxValue = b;
                }
            }
        }
        for (Entry<String, Integer> entry : dic.entrySet()) {
            if (maxValue == entry.getValue()) {
                return entry.getKey(); // 取到最大值的 value 对应的 key
            }
        }
        // Comparator<Map.Entry<String, Integer>> byValue =
        // Map.Entry.comparingByValue();
        // Map.Entry<String, Integer> maxEntry = Collections.max(dic.entrySet(),
        // byValue);
        // System.out.println("word: " + maxEntry.getKey() + ";Maximum value is " +
        // maxEntry.getValue());
        // return maxEntry.getKey();
        return "b";
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = new String[] { "a" };
        solution819 a = new solution819();
        System.out.println(a.mostCommonWord(paragraph, banned));

    }
}