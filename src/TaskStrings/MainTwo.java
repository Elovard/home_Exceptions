package TaskStrings;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        System.out.println("Введите слово для проверки: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

            String a = "";
            for (int i = s.length() - 1; i >= 0; --i) {
                a += s.charAt(i);
            }
            System.out.println(a);

         if (s.equals(a)) {
             System.out.println("Это палиндромы.");
         } else {
             System.out.println("Это не палиндромы.");
         }
    }
}
