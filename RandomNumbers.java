<<<<<<< HEAD
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
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
=======
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class RandomNumbers extends Random implements Supplier<Integer> {

    public static void main(String[] args) {
        RandomNumbers rnd = new RandomNumbers(11, 33);
        System.out.println(rnd.get());
    }

    private int lowBound;
    private int highBound;


    public RandomNumbers(int lowBound, int highBound) {
        this.lowBound = lowBound;
        this.highBound = highBound;
        if(highBound<=lowBound){
            throw new IllegalArgumentException();
        }
    }

    public Stream streamOfInts(){
        return Stream.generate(()-> get());
    }

    //nie jestem pewien czy o to chodziło bo metoda zwraca jedną liczbę z zakresu a chyba chodziło o strumień?
    @Override
    public Integer get() {
        return new RandomNumbers(lowBound, highBound).ints(lowBound, highBound).findFirst().getAsInt() ;
    }
}
>>>>>>> 5a44295dccceb74a8dd1e7733bc154d011d08491
