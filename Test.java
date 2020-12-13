import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Test.java"));
        String line = reader.readLine();
        Analysis analysis = new Analysis();
        while (line != null){

//            System.out.println(line);
            analysis.append(line);
            line = reader.readLine();
        }
//        brackets.show();
        int[] text = {1, 2};
        analysis.main(1);
        String x = ("5");
        if (sda)

    }
}
