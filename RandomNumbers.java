import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class RandomNumbers extends Random implements Supplier<Integer> {

    private int lowBound;
    private int highBound;


    public RandomNumbers(int lowBound, int highBound) {
        this.lowBound = lowBound;
        this.highBound = highBound;
        if(highBound<=lowBound){
            throw new IllegalArgumentException();
        }
    }

//    zwraca nieskończony strumień intów z danego przedziału
    public Stream<Integer> streamOfInts(){
        return Stream.generate(new RandomNumbers(lowBound, highBound)::get);
    }


    //metoda get() zwraca inta z przedziału
    @Override
    public Integer get() {
        return new RandomNumbers(lowBound, highBound).ints(lowBound, highBound).findFirst().getAsInt() ;
    }
}
