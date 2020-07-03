import java.util.Locale;

public class ImprimeInformacoesDeProdutos {
    private static String product1 = "Computer";
    private static String product2 = "Office desk";
    private static int age = 30;
    private static int code = 5290;
    private static char gender = 'F';
    private static double price1 = 2100.0;
    private static double price2 = 650.50;
    private static double measure = 53.234567;

    public static void main(String[] args) {
        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", product1, price1);
        System.out.printf("%s, which price is $%.2f%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }

}
