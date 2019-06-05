<<<<<<< HEAD
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers implements UnaryOperator<Integer> {


    @Override
    public Integer apply(Integer i) {
        return i + 2;
    }

    public Stream<Integer> streamOfEven(){
        return Stream.iterate(0,new EvenNumbers()::apply).limit(7);
    }


}
=======
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class EvenNumbers implements UnaryOperator<Stream> {


    //tutaj metoda apply zwraca strumień intów ale jako argument przyjmuje Stream więc wydaje mi sie to troche bez sensu
    @Override
    public Stream apply(Stream i) {
        return Stream.iterate(0, y -> y=+2);

    }

    public void streamOfEven(){
         Stream.iterate(0, y ->y+2).forEach(System.out::println);
    }


    public static boolean isOdd(Integer number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }
}
>>>>>>> 5a44295dccceb74a8dd1e7733bc154d011d08491
