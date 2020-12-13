import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Semicolon extends MethodMain{
    ArrayList<String> semicolon = new ArrayList<String>();

    public void semicolon(String semicolon, int line_number) {
        String value = "";
        Pattern pattern = Pattern.compile("main|long|boolean|double|char|float|String|int|[\\[\\]=]|;$|\\{$|\\)$");
        Matcher matcher = pattern.matcher(semicolon);
        while (matcher.find()) {
            value += semicolon.substring(matcher.start(), matcher.end());
        }
        if (value.length() > 0 && !Character.toString(value.charAt(value.length()-1)).equals("{")) {
            if (value.equals(")")){
                System.out.println("Пропущен символ \";\" или \"{\"");
            }
            else if (!Character.toString(value.charAt(value.length() - 1)).equals(";")) {
                System.out.println("Пропущен символ \";\" на строке " + line_number);
            }
            this.semicolon.add(value);
        }
    }

    public void setSemicolon(String semicolon, int line_number) {
        semicolon(semicolon, line_number);
    }
    public void getSemicolon(){
        System.out.println(this.semicolon);
    }
}
