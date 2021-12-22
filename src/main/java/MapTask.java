import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    //Transform the given input List<String> into List<Integer>
    public static List<Integer> mapping(List<String> arr){
        return arr.stream().filter(x-> x.matches("-?\\d+(\\.\\d+)?"))
                .map(x -> Integer.parseInt(x)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList("1", "abc", "2", "3");
        System.out.println(mapping(array));
    }
}
