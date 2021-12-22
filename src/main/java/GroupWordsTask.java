import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {
    // Group all the words by their first letter
    // Count how many times the group-key letter appears in the grouped words
    // Summarize the counts and combine them with character that represents a group

    private static Integer keyCount(Map.Entry<Character, List<String>> toCount){
        List<String> arr = toCount.getValue();
        Character key = toCount.getKey();
        int counter = 0;
        for(String word : arr){
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == key) counter++;
            }
        }
        return counter;
    }

    public static Map<Character, Integer> group(List<String>arr){
        Set<Map.Entry<Character, List<String>>> map = arr.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList())).entrySet();
        return map.stream().collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::keyCount));
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(group(array));
    }
}
