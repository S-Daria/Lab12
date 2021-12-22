import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    //create FizzBuzz game
    private static String FBgame(int x){
        if(x % 15 == 0) return "Fizz Buzz";
        if(x % 3 == 0) return "Fizz";
        if(x % 5 == 0) return "Buzz";
        return Integer.toString(x);
    }

    public static List<String> fizzBuzz(int n){
        return IntStream.range(0, n).boxed().collect(Collectors.toList()).stream()
                .map(x -> FBgame(x)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }
}
