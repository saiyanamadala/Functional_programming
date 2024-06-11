import java.util.List;
import java.util.Optional;

public class FP06optional {
    public static void main(String[] args){
       List<String> names=List.of("sai","ram","naga");
        Optional<String> name= names.stream().filter(n->n.startsWith("s")).findFirst();
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.isPresent());
        System.out.println(name.get());
    }
}
