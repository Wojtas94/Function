<<<<<<< HEAD
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ToFile implements Consumer<List<String>> {

   String path;

    public ToFile(String path) {
        this.path = path;
    }

    //wydaje mi sie że można to jeszcze dopracować bo w tym momencie zapisywanie do pliku jest ogarniczone do listy Stringów
    @Override
    public void accept(List<String> list) {
        try {
            Files.write(Paths.get(path),(Iterable<String>)list.stream()::iterator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
=======
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ToFile implements Consumer<String> {

    public static void main(String[] args) {
        ToFile tf = new ToFile();
        tf.accept("C:\\Users\\Lenovo\\Desktop\\testout.txt");
    }

    @Override
    public void accept(String s) {
        try {
            Files.write(Paths.get(s), (Iterable<String>)IntStream.range(0, 55).mapToObj(String::valueOf)::iterator);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
>>>>>>> 5a44295dccceb74a8dd1e7733bc154d011d08491
