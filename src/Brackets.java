import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brackets extends Semicolon{
    int check_brace, check_round_bracket, check_square_bracket = 0;
    ArrayList<Character> brace = new ArrayList<Character>();
    ArrayList<Character> round_bracket  = new ArrayList<Character>();
    ArrayList<Character> square_bracket = new ArrayList<Character>();
    ArrayList<Character> main = new ArrayList<Character>();

    public void append_brace(char bracket) {
        if (bracket == '{') {
            this.brace.add(bracket);
            this.check_brace += 1;
        }
        else if(bracket == '}'){
            brace.add(bracket);
            this.check_brace -= 1;
        }
    }
    private void append_round(char bracket){
        if (bracket == '(') {
            round_bracket.add(bracket);
            this.check_round_bracket += 1;
        }
        else if(bracket == ')'){
            round_bracket.add(bracket);
            this.check_round_bracket -= 1;
        }
    }
    private void append_square(char bracket){
        if (bracket == '[') {
            square_bracket.add(bracket);
            this.check_square_bracket += 1;
        }
        else if(bracket == ']'){
            square_bracket.add(bracket);
            this.check_square_bracket -= 1;
        }
    }
    public void setAppend_brace(char bracket){
        append_brace(bracket);
    }
    public void setAppend_round(char bracket){
        append_round(bracket);
    }
    public void setAppend_square(char bracket){
        append_square(bracket);
    }
    public void getBrackets() {
        System.out.println("Фигурные скобки: " + brace + " check " + check_brace);
        System.out.println("Круглые скобки: " + round_bracket + " check " + check_round_bracket);
        System.out.println("Фигурные скобки: " + square_bracket + " check " + check_square_bracket);
    }
}
