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
