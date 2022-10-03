import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Ex. 1
        BinaryOperator<String> binaryOperator = BinaryOperator.maxBy(String::compareTo);

        // Ex. 2
        Predicate<String> predicate = Predicate.not(String::isEmpty).and(Predicate.not(Objects::nonNull));

        String str1 = "pwwkew";
        findLongestUniqueSequence(str1);
    }

        // Ex. 3 Самое оптимальное Time Complexity в данной задаче O(n)
    public static void findLongestUniqueSequence(String str){
        String result = "";
        String temp = "";

        for (char c : str.toCharArray()) {
            if (temp.contains(String.valueOf(c))){
                if (result.length() < temp.length()) {
                    result = temp;
                    temp = "";
                }
            }
            else temp = temp + c;
        }
        System.out.println(result.length() > temp.length() ? result : temp);
    }
}
