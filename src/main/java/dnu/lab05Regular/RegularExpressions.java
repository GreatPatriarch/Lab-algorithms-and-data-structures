package dnu.lab05Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static boolean isValidNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static String replaceSpaces(String text) {
        Pattern pattern = Pattern.compile(" +");
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(" ");
    }

    public static String removeHtmlTags(String htmlText) {
        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher matcher = pattern.matcher(htmlText);
        return matcher.replaceAll("");
    }
}
