public class Analysis extends Brackets {
    private static int line_number = 1;

    public void append(String value) {
        String valueR = value.replaceAll("\\s", "");
        for (int i = 0; i < valueR.length(); i++) {
            setAppend_brace(valueR.charAt(i));
            setAppend_round(valueR.charAt(i));
            setAppend_square(valueR.charAt(i));
        }
        setSemicolon(valueR, this.line_number);
        this.line_number++;
        setMain(value);
    }
}
