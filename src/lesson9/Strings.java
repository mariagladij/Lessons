package lesson9;

import java.util.Locale;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static void main(String... args) {
        String s = "";
        s = "123";

        String strNew = new String();

        strNew = "    we are the best     ";

//        System.out.println(strNew.length());
//        System.out.println(strNew.indexOf("w"));
//        System.out.println(strNew.lastIndexOf("w"));
//        System.out.println(strNew.substring(strNew.indexOf("t"),strNew.lastIndexOf("t")));
//        System.out.println("+" + strNew.trim() + "+");
//        String string1= strNew + "!!";
//        System.out.println(string1);
//
//        String a1 = "a";
//        String a2 = "a";
//        System.out.println(a1 == a2);
//        String strNew2 = "we are the best";
//        String strNew3 = "$2200.00";
//        String strNew4 = "2200.00";
        //System.out.println(strNew2.equals(strNew3));
        //System.out.println(strNew2.contains("h"));
//        System.out.println(strNew2.toUpperCase().contains("H"));
//        System.out.println(strNew2.toUpperCase());

        //HOMEWORK task 3
        //System.out.println(strNew3.replace("e", ""));

        //HOMEWORK task 2
        //String strNew3 = "$2200.00";
        //System.out.println(strNew3.replace("$", ""));


        //{"name": "Lily", "age" : "40"}
//        StringBuilder stringBuilder2 = new StringBuilder();
//        stringBuilder2.append("{");
//        stringBuilder2.append("\"name\": \"Lily\"");
//        stringBuilder2.append(", ");
//        stringBuilder2.append("\"age\": \"40\"");
//        stringBuilder2.append("}");
//        System.out.println(stringBuilder2);

//        String someString = "we are the best";
//        someString = someString.replace("a","7");
//        System.out.println(someString);
//
//        String someString2 = "we are the best";
//        someString2 = someString.replaceAll("t","!");
//        System.out.println(someString2);


        String text = "The phone number +380992097835 dfhhdf@gmail.com has been selected, please complete your purchase.\n" +
                "To order a phone number:\n" +
                "- specify your current address dfhhdfdgf@gm24ail.com (city, street, number and postal code)";

        System.out.println(findEmails(text));


    }

    //HOMEWORK task 4
    public static String findEmails(String text) {
        StringBuilder phonenumber = new StringBuilder();
        String regex = "\\b[A-Za-z0-9_.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            phonenumber.append(matcher.group());
            phonenumber.append("\n");
        }
        return phonenumber.toString();
    }
}
