import java.util.List;

public class FP05Map {
    public static void main(String[] args){
       printElements(List.of(1,2,3,4,5));
    }

    public static void printElements(List<Integer> numbers){
        numbers.stream()
                .filter(number->number%2==0)
                .map(number->"Even Square:"+number*number)
                .forEach(System.out::println);
    }
}
