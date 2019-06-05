<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter implements Predicate<String> {

    public static void main(String[] args) {
        Filter f = new Filter();

        List<String> lista = new ArrayList<>();
        lista.add("al");
        lista.add("alfred");
        lista.add("wojciech");
        lista.add("m");
        lista.add("mort");
        lista.add("weeeeeeeee");
        lista.add("a1l");

        List<String> listaNew = f.newList(lista);
        for (String s : listaNew) {
            System.out.println(s);
        }
    }

    @Override
    public boolean test(String s) {
        return s.length()<5;
    }

    public List<String> newList(List<String> list){
        Filter f = new Filter();

        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if(f.test(s)){
                newList.add(s);
            }
        }
        return newList;
    }
}
>>>>>>> 5a44295dccceb74a8dd1e7733bc154d011d08491
