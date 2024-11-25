import java.util.regex.*;

public class WordFinder {
    public static void main(String[] args) {
        String text = "Apple banana apricot berry avocado";
        char letter = 'a';
        Pattern pattern = Pattern.compile("\\b" + letter + "[a-zA-Z]*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}