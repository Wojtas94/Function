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
