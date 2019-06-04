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
