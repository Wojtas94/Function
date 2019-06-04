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
        //kombinowałem długo ale nie udało mi sie wykminić jak zrobić to zadanie przy użuciu tego interfejsu funkcyjnego
        //i zrobiłem to iteracyjnie
        return null;
    }
    
    public String createString(){
        List<Character> list = new ArrayList<>();
        RandomStrings rnd = new RandomStrings();
        StringBuilder sb = new StringBuilder();
        //    char[] chars = new char[rnd.lengthOfString()];
            for (int j = 0; j <rnd.lengthOfString() ; j++) {
              //  chars[j] = (char) rnd.generateNumberAscii();
                list.add((char)rnd.generateNumberAscii());
              //  sb.append(chars[j]);
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

    public int lengthOfString(){
        RandomStrings rnd = new RandomStrings();
        return rnd.nextInt(Integer.MAX_VALUE);
    }
}
