import java.util.List;

public class FP03Filter {
    public static void main(String[] args){
       printElements(List.of(1,2,3,4,5));
    }

//    public static void print(int num){
//        System.out.println(num);
//    }
    public static boolean isEven(int number){
        return number%2==0;
    }

    public static void printElements(List<Integer> numbers){
        numbers.stream()
                .filter(FP03Filter::isEven)
                .forEach(System.out::println);
    }
}
