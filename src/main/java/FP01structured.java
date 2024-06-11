import java.util.List;

public class FP01structured {
    public static void main(String[] args){
       printElements(List.of(1,2,3,4,5));
    }

    public static void printElements(List<Integer> numbers){
        for(Integer num:numbers){
            System.out.println(num);
        }
    }
}
