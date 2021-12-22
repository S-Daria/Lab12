import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    //Transform the sequence of words List<String> to a sequence of letters of every word in the sequence List<String>
    public static List<String> flattingStrings(List<String> arr){
        return arr.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList("i", "am", "grut");
        System.out.println(flattingStrings(array));
    }

}
