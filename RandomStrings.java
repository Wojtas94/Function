
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class RandomStrings extends Random implements Function<Integer, String> {
    //65 - 90
    //97 - 122

    @Override
    public String apply(Integer i) {
        List<Character> list = new ArrayList<>();
        RandomStrings rnd = new RandomStrings();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i ; j++) {
            list.add((char)rnd.generateNumberAscii());
        }
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }


    public int generateNumberAscii(){
        Random rnd = new Random();
        return rnd.nextInt(25)+97;
    }
}
