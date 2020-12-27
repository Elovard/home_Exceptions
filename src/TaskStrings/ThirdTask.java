package TaskStrings;
import java.util.Scanner;


public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yourString;
        System.out.println("Введите слово: ");
        yourString = scan.nextLine();
        StringBuffer stringBuffer = new StringBuffer(yourString);
        System.out.println("Введите откуда удаляем: ");
        String a = scan.nextLine();
        System.out.println("Введите до куда удаляем: ");
        String b = scan.nextLine();
        System.out.println();

        int start = yourString.indexOf(a);
        int end = yourString.indexOf(b);


        String answer = yourString.substring(0, start) + yourString.substring(end + 1);
        System.out.println(answer);






    }
}
