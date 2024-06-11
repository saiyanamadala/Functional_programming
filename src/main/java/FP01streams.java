import java.util.List;

public class FP01streams {
    public static void main(String[] args){
       printElements(List.of(1,2,3,4,5));
    }

    public static void print(int num){
        System.out.println(num);
    }

    public static void printElements(List<Integer> numbers){
        numbers.stream().forEach(FP01streams::print);
//        for(Integer num:numbers){
//            System.out.println(num);
//        }
    }
}
