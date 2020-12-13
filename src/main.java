import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Test.java"));
        String line = reader.readLine();
        Analysis analysis = new Analysis();
        while (line != null){
            analysis.append(line);
            line = reader.readLine();
        }
        analysis.getBrackets();
        analysis.getSemicolon();
    }
}
