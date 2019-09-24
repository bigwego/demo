import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class T {

    public int add(int x, int y) {
        return x + y;
    }

    public boolean callArgumentInstance(File file) {
        return file.exists();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
