import java.util.function.UnaryOperator;
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
