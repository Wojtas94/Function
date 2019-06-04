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
