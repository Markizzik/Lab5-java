import java.util.regex.*;

public class CapitalAfterLowercaseFinder {
    public static void main(String[] args) {
        String text = "aBc DeFg HiJk";
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group(1) + "!" + matcher.group(2) + "!");
        }
        matcher.appendTail(result);
        System.out.println(result.toString());
    }
}