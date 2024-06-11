import java.util.List;

public class FP04Lambda {
    public static void main(String[] args){
       printElements(List.of(1,2,3,4,5));
    }


//    public static boolean isEven(int number){
//        return number%2==0;
//    }

    public static void printElements(List<Integer> numbers){
        numbers.stream()
                .filter(number->number%2==0)
                .forEach(System.out::println);
    }
}
