package dnu.lab05Regular;

import static dnu.lab05Regular.RegularExpressions.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(RegularExpressions.isValidNumber("(+380)50-333-33-33"));
        System.out.println(RegularExpressions.replaceSpaces("Я хочу    бути     програмістом"));
        System.out.println(RegularExpressions.removeHtmlTags("<div><p>Текст</p></div>"));
    }
}
