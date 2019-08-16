import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.text.NumberFormat;
public class MyFirstJavaClass{



public static void main(String[]args) {
    System.out.println("in main");
    int a=234;
    Locale indiaLocale = new Locale("en", "IN");

    String us     = NumberFormat.getCurrencyInstance(Locale.US).format(a);
    String india  = NumberFormat.getCurrencyInstance(indiaLocale).format(a);
    String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(a);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(a);

    /* Print output */
    System.out.println("US: "     + us);
    System.out.println("India: "  + india);
    System.out.println("China: "  + china);
    System.out.println("France: " + france);
    System.out.println("checking push");

        }
}