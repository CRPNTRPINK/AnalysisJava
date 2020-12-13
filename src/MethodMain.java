import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodMain {
    private void main(String str){
        String value = "";
        Pattern pattern = Pattern.compile("public static void main[ ()a-zA-Z\\[\\]]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            value += str.substring(matcher.start(), matcher.end());
        }
        if (value.length() > 0) {
            String value_argument;
            String[] value_analysis = value.substring(value.indexOf('(')+1, value.indexOf(')')).split(" ");
            if (value_analysis[1].equals("[]")) {
                value_argument = value_analysis[0] + " " + value_analysis[1];
            }
            else{
                value_argument = value_analysis[0];
            }
            if (!(value_argument.equals("String[]") | value_argument.equals("String []"))) {
                System.out.println("Аргумент " + value + " не является String[]");
            }
        }
    }

    public void setMain(String str){
        main(str);
    }
}
