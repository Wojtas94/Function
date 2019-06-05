
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter implements Predicate<String> {

    int lengthOfString;

    public Filter(int lengthOfString) {
        this.lengthOfString = lengthOfString;
        if(lengthOfString<0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean test(String s) {
        return s.length()<lengthOfString;
    }

    public List<String> newList(List<String> list){
        return list.stream().filter(new Filter(lengthOfString)::test).collect(Collectors.toList());
    }
}
